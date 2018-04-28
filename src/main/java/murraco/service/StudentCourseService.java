package murraco.service;

import murraco.domain.StudentCourse;
import murraco.exception.CustomException;
import murraco.repository.StudentCourseRepository;
import murraco.dto.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.PersistenceException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentCourseService {

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public ResponseEntity<List> listCourse() {
        List<StudentCourse> studentCourseList = new ArrayList<>();
        studentCourseRepository.findAll().forEach(studentCourseList::add);
        return new ResponseEntity<List>(studentCourseList, HttpStatus.OK);
    }

    public ResponseEntity<CustomResponse> addCourse(StudentCourse studentCourse) {
        studentCourseRepository.save(studentCourse);
        return new ResponseEntity<CustomResponse>(new CustomResponse("Just create"), HttpStatus.CREATED);
    }

    public ResponseEntity<CustomResponse> deleteCourse(int id) {
        try {
            studentCourseRepository.deleteById(id);
            return new ResponseEntity<CustomResponse>(new CustomResponse("Just delete"), HttpStatus.NO_CONTENT);
        } catch(PersistenceException e) {
            throw new CustomException("Id not found", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }
}
