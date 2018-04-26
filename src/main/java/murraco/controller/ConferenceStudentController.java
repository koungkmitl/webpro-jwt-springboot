package murraco.controller;

import murraco.dto.RequestConferenceDto;
import murraco.response.CustomResponse;
import murraco.service.ConferenceStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conference/student")
public class ConferenceStudentController {
    private final Logger LOG = LoggerFactory.getLogger(ConferenceStudentController.class);

    @Autowired
    private ConferenceStudentService conferenceStudentService;

    public ResponseEntity<CustomResponse> addConference(@RequestBody RequestConferenceDto requestConferenceDto) {
        return conferenceStudentService.addConferenceStudent(requestConferenceDto);
    }

}
