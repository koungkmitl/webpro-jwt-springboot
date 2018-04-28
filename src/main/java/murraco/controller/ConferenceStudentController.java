package murraco.controller;

import murraco.service.ConferenceStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conference/student")
public class ConferenceStudentController {

    @Autowired
    private ConferenceStudentService conferenceStudentService;


}
