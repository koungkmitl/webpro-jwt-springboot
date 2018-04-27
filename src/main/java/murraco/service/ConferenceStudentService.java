package murraco.service;

import murraco.domain.Conference;
import murraco.dto.RequestConferenceDto;
import murraco.repository.ConferenceRepository;
import murraco.repository.StudentRepository;
import murraco.repository.TeacherRepository;
import murraco.repository.UserRepository;
import murraco.response.CustomResponse;
import murraco.security.JwtTokenProvider;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class ConferenceStudentService {

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

    @Autowired
    private UserService userService;

    @Autowired
    private ConferenceRepository conferenceRepository;

    public ResponseEntity<CustomResponse> addConferenceStudent(RequestConferenceDto requestConferenceDto, HttpServletRequest req) {
        Conference conference = modelMapper.map(requestConferenceDto, Conference.class);

//        conference.setUser(userService.search(tokenService.);
        conferenceRepository.save(conference);
        return new ResponseEntity<CustomResponse>(new CustomResponse("Just create"), HttpStatus.CREATED);
    }



}
