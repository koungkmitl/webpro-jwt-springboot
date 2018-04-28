package murraco.controller;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> f50b60e8338c933be39343af240e1d105f7db12a

@RestController
<<<<<<< HEAD
@CrossOrigin( origins = "http://161.246.38.104:3000")
@RequestMapping("/conference")
public class ConferenceStudentController {

    @Autowired
    private ConferenceService conferenceService;
//
//    @Autowired
//    private ModelMapper modelMapper;
//
//    @Autowired
//    private TokenService tokenService;
//
//    @PostMapping(value = "/add")
//    public ResponseEntity<CustomResponse> addConference(@RequestBody RequestConferenceDto requestConferenceDto, HttpServletRequest req) {
//        System.out.println(tokenService.getUsername(req));
//        System.out.println(requestConferenceDto.getStartDate());
//        conferenceService.addConferenceStudent(requestConferenceDto, req);
////        Student student = modelMapper.map(requestConferenceDto, Student.class);
////        conferenceStudentService.addConferenceStudent();
//
//        return new ResponseEntity<CustomResponse>(new CustomResponse(requestConferenceDto.getStartDate().toString()), HttpStatus.CREATED);
//    }
    @Autowired
    private ConferenceRepository conferenceRepository;

    @PostMapping(value = "/add")
    public ResponseEntity<CustomResponse> addConference(@RequestBody RequestConferenceDto requestConferenceDto, HttpServletRequest req) {
        conferenceService.addConferenceStudent(requestConferenceDto, req);
        return new ResponseEntity<CustomResponse>(new CustomResponse(""), HttpStatus.OK);
    }
//    public Conference add(@RequestBody Conference conference, HttpServletRequest req){
//        conferenceRepository.save(conference);
//        return conference;
//    }

=======
@RequestMapping("/conference/student")
public class ConferenceStudentController {

    @Autowired
    private
>>>>>>> f50b60e8338c933be39343af240e1d105f7db12a
}
