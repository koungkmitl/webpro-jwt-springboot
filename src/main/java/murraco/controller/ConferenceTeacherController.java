package murraco.controller;

import murraco.domain.Teacher;
import murraco.dto.CustomResponse;
import murraco.dto.RequestConferenceDto;
import murraco.dto.TeacherConferenceResponse;
import murraco.service.ConferenceTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/conference/teacher")
public class ConferenceTeacherController {

    @Autowired
    private ConferenceTeacherService conferenceTeacherService;

    @PostMapping("/add")
//    @PreAuthorize("hasRole('ROLE_TEACHER')")
    public ResponseEntity<CustomResponse> teacherAdd(@RequestBody RequestConferenceDto requestConferenceDto, HttpServletRequest req){
        return conferenceTeacherService.add(requestConferenceDto, req);
    }

    @PostMapping("/list")
//    @PreAuthorize("hasRole('ROLE_TEACHER')")
    public ResponseEntity<TeacherConferenceResponse> teacherList(HttpServletRequest req){
        return conferenceTeacherService.list(req);
    }

    @PostMapping("/test")
//    @PreAuthorize("hasRole('ROLE_TEACHER')")
    public ResponseEntity<Teacher> teachertest(HttpServletRequest req){
        return conferenceTeacherService.test(req);
    }
}
