package murraco.controller;

import murraco.domain.Conference;
import murraco.domain.Image;
import murraco.domain.Teacher;
import murraco.dto.CustomResponse;
import murraco.dto.ImageDto;
import murraco.dto.RequestConferenceDto;
import murraco.dto.TeacherConferenceResponse;
import murraco.service.ConferenceTeacherService;
import murraco.service.TeacherImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/conference/teacher")
public class ConferenceTeacherController {

    @Autowired
    private ConferenceTeacherService conferenceTeacherService;

    @Autowired
    private TeacherImageService teacherImageService;

    @PostMapping("/add")
//    @PreAuthorize("hasRole('ROLE_TEACHER')")
    public ResponseEntity<CustomResponse> teacherAdd(@RequestBody RequestConferenceDto requestConferenceDto, HttpServletRequest req){
        return conferenceTeacherService.add(requestConferenceDto, req);
    }

    @GetMapping("/list")
//    @PreAuthorize("hasRole('ROLE_TEACHER')")
    public ResponseEntity<TeacherConferenceResponse> teacherList(HttpServletRequest req){
        return conferenceTeacherService.list(req);
    }

    @PostMapping("/image")
    public ResponseEntity<CustomResponse> teacherImage(@RequestParam("file") MultipartFile file, HttpServletRequest req, @ModelAttribute ImageDto imageDto){
        return teacherImageService.sendImage(req, file, imageDto);
    }
}
