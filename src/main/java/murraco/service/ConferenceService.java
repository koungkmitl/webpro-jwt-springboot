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

    @Autowired
    private UserService userService;

    @Autowired
    private QualityService qualityService;

    private ConferenceRepository conferenceRepository;

    public ResponseEntity<CustomResponse> addConferenceStudent(RequestConferenceDto requestConferenceDto, HttpServletRequest req) {
//        Conference conference = modelMapper.map(requestConferenceDto, Conference.class);
        try {

            modelMapper.getConfiguration().setAmbiguityIgnored(true);
            Conference conference = modelMapper.map(requestConferenceDto, Conference.class);
            conference.setUser(userService.search(tokenService.getUsername(req)));
            System.out.println(conference.getUser().getUsername());
            System.out.println(conference.getId());
            System.out.println(conference.getState());
            System.out.println(requestConferenceDto.getConferenceId());
            System.out.println(requestConferenceDto.getUserId());
            conferenceRepository.save(conference);
            System.out.println(conference.getId());
        } catch ( Exception e ) {
            System.out.println(e);
        }
//        System.out.println(tokenService.getUsername(req));
//        conference.setUser(userService.search(tokenService.getUsername(req)));
//        System.out.println(conference.getUser());
//        if ( conference.getQualityConference().equals("cif") ){
//            qualityService.addCif(requestConferenceDto);
//        } else if ( conference.getQualityConference().equals("sjr") ){
//            qualityService.addSjr(requestConferenceDto);
//        } else if ( conference.getQualityConference().equals("scopus") ){
//            qualityService.addScopus(requestConferenceDto);
//        } else {
//            qualityService.addCcr(requestConferenceDto);
//        }
//        conferenceRepository.save(conference);
        return new ResponseEntity<CustomResponse>(new CustomResponse("Just create"), HttpStatus.CREATED);
    }



}
