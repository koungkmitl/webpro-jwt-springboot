package murraco.controller;

import murraco.domain.Conference;
import murraco.dto.RequestConferenceDto;
import murraco.dto.CustomResponse;
import murraco.dto.Test;
import murraco.repository.ConferenceRepository;
import murraco.service.ConferenceService;
import murraco.service.TokenService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
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

}
