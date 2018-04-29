package murraco.controller;

import murraco.dto.CustomResponse;
import murraco.dto.ImageDto;
import murraco.dto.RequestConferenceDto;
import murraco.dto.StudentConferenceResponse;
import murraco.service.ConferenceStudentService;

import murraco.service.StudentImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/conference/student")
public class ConferenceStudentController {

    @Autowired
    private ConferenceStudentService conferenceStudentService;

    @Autowired
    private StudentImageService studentImageService;

    @PostMapping("/add")
//    @PreAuthorize("hasAnyRole('ROLE_STUDENT')")
    public ResponseEntity<CustomResponse> studentAdd(@RequestBody RequestConferenceDto requestConferenceDto, HttpServletRequest req){
        return conferenceStudentService.add(requestConferenceDto, req);
    }

    @GetMapping("/list")
//    @PreAuthorize("hasRole('ROLE_STUDENT')")
    public ResponseEntity<StudentConferenceResponse> studentList(HttpServletRequest req){
        return conferenceStudentService.list(req);
    }

    @PostMapping("/image")
    public ResponseEntity<CustomResponse> studentImage(@RequestParam("file") MultipartFile file, HttpServletRequest req, @ModelAttribute ImageDto imageDto){
        return studentImageService.sendImage(req, file, imageDto);
    }

}
