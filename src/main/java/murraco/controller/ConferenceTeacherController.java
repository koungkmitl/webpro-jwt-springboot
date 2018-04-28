package murraco.controller;

import murraco.dto.CustomResponse;
import murraco.dto.RequestConferenceDto;
import murraco.service.ConferenceTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin( origins = "http://161.246.38.104:3000")
@RequestMapping("/conference/teacher")
public class ConferenceTeacherController {

    @Autowired
    private ConferenceTeacherService conferenceTeacherService;

    @PutMapping("/add")
    public ResponseEntity<CustomResponse> teacherAdd(@ResponseBody RequestConferenceDto requestConferenceDto, HttpServletRequest req){
        return conferenceTeacherService.add(req);
    }
}
