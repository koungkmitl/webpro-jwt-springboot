package murraco.controller;

import murraco.dto.CommentDto;
import murraco.dto.CustomResponse;
import murraco.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/comment/check")
public class CommentCheckController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/student")
    public ResponseEntity<CustomResponse> studentCheck(@RequestBody CommentDto commentDto, HttpServletRequest req){
        return commentService.studentCheck(commentDto, req);
    }

    @PostMapping("/teacher")
    public ResponseEntity<CustomResponse> teacherCheck(@RequestBody CommentDto commentDto, HttpServletRequest req){
        return commentService.teacherCheck(commentDto, req);
    }
}
