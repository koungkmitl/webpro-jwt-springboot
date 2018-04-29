package murraco.service;

import io.minio.MinioClient;
import io.minio.errors.InvalidEndpointException;
import io.minio.errors.InvalidPortException;
import murraco.domain.Conference;
import murraco.domain.Image;
import murraco.domain.Teacher;
import murraco.domain.User;
import murraco.domain_enum.TypeImage;
import murraco.dto.CustomResponse;
import murraco.dto.ImageDto;
import murraco.exception.CustomException;
import murraco.repository.ImageRepository;
import murraco.repository.TeacherRepository;
import murraco.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Service
public class TeacherImageService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ImageRepository imageRepository;

    private MinioClient minioClient;

    private static final String URL = "http://161.246.38.104";
    private static final int PORT = 5002;
    private static final String BUCKET_NAME = "conference";
    private static final String ACCESS_KEY = "USQBDCXRNTD2DX4CY5Y9";
    private static final String SECRET_KEY = "6XVwwIaGcvt3/JBavI5zAS/sKS13i7gxA/oi/j5O";

    {
        try {
            minioClient = new MinioClient(URL, PORT, ACCESS_KEY, SECRET_KEY);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ResponseEntity<CustomResponse> sendImage(HttpServletRequest req, MultipartFile file, ImageDto imageDto){
        User user = userRepository.findByUsername(tokenService.getUsername(req));

        if (file.isEmpty()) {
            return new ResponseEntity<CustomResponse>(new CustomResponse("image not found"), HttpStatus.BAD_REQUEST);
        }
        String type_file = file.getContentType().split("/")[1];
        try {
            byte[] bytes = file.getBytes();
            minioClient.putObject(BUCKET_NAME, String.format("%d-%s.%s", user.getId(), java.util.UUID.randomUUID().toString(), type_file), file.getInputStream(), file.getContentType());
        } catch (Exception e) {
            throw new CustomException("Minio Error !!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        Teacher teacher = teacherRepository.findOne(imageDto.getConferenceId());
        Image image = new Image();
        if ( imageDto.getTypeImage().equals("FORM") ) {
            image.setTypeImage(TypeImage.FORM);
        } else {
            image.setTypeImage(TypeImage.ACCEPTANCE);
        }
        image.setUrl(String.format("/%s/%d-%s.%s", BUCKET_NAME, user.getId(), java.util.UUID.randomUUID().toString(), type_file));
        image.setConference(teacher);
        imageRepository.save(image);

        return new ResponseEntity<CustomResponse>(new CustomResponse("upload complete"), HttpStatus.OK);
    }

}
