package murraco.controller;

import murraco.dto.RequestConferenceDto;
import murraco.response.CustomResponse;
import murraco.service.ConferenceService;
import murraco.service.TokenService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/conference/student")
public class ConferenceStudentController {
//    private final Logger LOG = LoggerFactory.getLogger(ConferenceStudentController.class);

    @Autowired
    private ConferenceService conferenceService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private TokenService tokenService;

    @PostMapping(value = "/add")
    public ResponseEntity<CustomResponse> addConference(@RequestBody RequestConferenceDto requestConferenceDto, HttpServletRequest req) {
        System.out.println(tokenService.getUsername(req));
        System.out.println(requestConferenceDto.getStartDate());
        conferenceService.addConferenceStudent(requestConferenceDto, req);
//        Student student = modelMapper.map(requestConferenceDto, Student.class);
//        conferenceStudentService.addConferenceStudent();

        return new ResponseEntity<CustomResponse>(new CustomResponse(requestConferenceDto.getStartDate().toString()), HttpStatus.CREATED);
    }
}
