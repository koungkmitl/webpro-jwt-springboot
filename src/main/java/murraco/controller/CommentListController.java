package murraco.controller;

import murraco.domain.Student;
import murraco.domain.Teacher;
import murraco.repository.TeacherRepository;
import murraco.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/comment/list")
public class CommentListController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/teacher")
//    @PreAuthorize("hasRole('ROLE_STUDENT')")
    public ResponseEntity<List<Teacher>> teacherList(HttpServletRequest req){
        return commentService.teacherList(req);
    }

    @GetMapping("/student")
//    @PreAuthorize("hasRole('ROLE_STUDENT')")
    public ResponseEntity<List<Student>> studentList(HttpServletRequest req){
        return commentService.studentList(req);
    }

}
