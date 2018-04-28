package murraco.controller;

import murraco.domain.StudentCourse;
import murraco.dto.CustomResponse;
import murraco.dto.StudentCourseResponse;
import murraco.service.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/studentcourse")
public class StudentCourseController {

    @Autowired
    private StudentCourseService studentCourseService;

    @PostMapping(value = "/add")
    public ResponseEntity<CustomResponse> add(@RequestBody StudentCourse studentCourse) {
        return studentCourseService.addCourse(studentCourse);
    }

    @GetMapping()
    public ResponseEntity<List<StudentCourseResponse>> list() {
        return studentCourseService.listCourse();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<CustomResponse> delete(@PathVariable int id) {
        return studentCourseService.deleteCourse(id);
    }

}
