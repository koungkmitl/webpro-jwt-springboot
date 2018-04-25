package murraco.controller;

import murraco.domain.StudentCourse;
import murraco.response.CustomResponse;
import murraco.service.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentcourse")
public class StudentCourseController {

    @Autowired
    private StudentCourseService studentCourseService;

    @GetMapping(value = "/list")
    public ResponseEntity<List> list() {
        return studentCourseService.listCourse();
    }

    @PostMapping(value = "/create")
    public ResponseEntity<CustomResponse> addCourse(@RequestBody StudentCourse studentCourse) {
        return studentCourseService.addCourse(studentCourse);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<CustomResponse> delete(@PathVariable int id) {
        return studentCourseService.deleteCourse(id);
    }
}
