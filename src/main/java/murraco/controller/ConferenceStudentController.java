package murraco.controller;

import murraco.domain.*;
import murraco.dto.RequestConferenceDto;
import murraco.dto.StudentDto;
import murraco.response.CustomResponse;
import murraco.service.ConferenceStudentService;
import murraco.service.QualityService;
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
    private final Logger LOG = LoggerFactory.getLogger(ConferenceStudentController.class);

    @Autowired
    private ConferenceStudentService conferenceStudentService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private QualityService qualityService;

    @Autowired
    private TokenService tokenService;

    @PostMapping(value = "/add")
    public ResponseEntity<CustomResponse> addConference(@RequestBody RequestConferenceDto requestConferenceDto) {
        Conference conference = modelMapper.map(requestConferenceDto, Conference.class);
//        conferenceStudentService.addConferenceStudent(requestConferenceDto);
        Student student = modelMapper.map(requestConferenceDto, Student.class);
//        conferenceStudentService.addConferenceStudent();
        if ( conference.getQualityConference().equals("cif") ){
            qualityService.addCif(requestConferenceDto);
        } else if ( conference.getQualityConference().equals("sjr") ){
            qualityService.addSjr(requestConferenceDto);
        } else if ( conference.getQualityConference().equals("scopus") ){
            qualityService.addScopus(requestConferenceDto);
        } else {
            qualityService.addCcr(requestConferenceDto);
        }
        return new ResponseEntity<CustomResponse>(new CustomResponse(requestConferenceDto.getStartDate().toString()), HttpStatus.CREATED);
    }
}
