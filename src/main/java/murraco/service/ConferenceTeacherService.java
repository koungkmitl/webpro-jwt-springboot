package murraco.service;

import murraco.domain.Conference;
import murraco.domain.User;
import murraco.dto.CustomResponse;
import murraco.dto.RequestConferenceDto;
import murraco.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;

@Service
public class ConferenceTeacherService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<CustomResponse> add(RequestConferenceDto requestConferenceDto, HttpServletRequest req){
        User user = userRepository.findByUsername(tokenService.getUsername(req));
        Conference conference = modelMapper.map(requestConferenceDto, Conference.class);

        for (Field field : conference.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = null;
            try {
                value = field.get(conference);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            System.out.printf("%s: %s%n", name, value);
        }

        return new ResponseEntity<CustomResponse>(new CustomResponse(""), HttpStatus.CREATED);
    }
}
