package murraco.service;

import murraco.domain.Student;
import murraco.repository.StudentRepository;
import murraco.repository.TeacherRepository;
import murraco.repository.UserRepository;
import murraco.response.CustomResponse;
import murraco.security.JwtTokenProvider;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class ConferenceService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenService tokenService;

    public  ResponseEntity<CustomResponse> listConferenceStudent(HttpServletRequest req) {
//        int userId = tokenService.getUserId(req);
//        List<Student> allByUserId = studentRepository.findAllByUserId(userId);
    }

    public ResponseEntity<CustomResponse> addConferenceStudent(Student student) {
        studentRepository.save(student);
        return new ResponseEntity<CustomResponse>(new CustomResponse("Just create"), HttpStatus.CREATED);
    }



    //return conference

    //return teacher


    //return student


    //return quality conference


    //handle image




//    public ResponseEntity<CustomResponse> addConference(ConferenceDto conferenceDto) {
//
//    }
}
