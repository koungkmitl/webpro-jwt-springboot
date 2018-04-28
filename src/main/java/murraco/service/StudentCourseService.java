package murraco.service;

import murraco.domain.StudentCourse;
import murraco.dto.CustomResponse;
import murraco.dto.StudentCourseResponse;
import murraco.exception.CustomException;
import murraco.repository.StudentCourseRepository;
import org.modelmapper.ModelMapper;
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

    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<CustomResponse> addCourse(StudentCourse studentCourse) {
        try {
            studentCourseRepository.save(studentCourse);
            return new ResponseEntity<CustomResponse>(new CustomResponse("Just created"), HttpStatus.CREATED);
        } catch(PersistenceException e) {
            throw new CustomException("Some error", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    public ResponseEntity<List<StudentCourseResponse>> listCourse() {
        try {
            List<StudentCourseResponse> studentCourseResponses = new ArrayList<>();
            studentCourseRepository.findAll().forEach((studentCourse) -> {
                studentCourseResponses.add(modelMapper.map(studentCourse, StudentCourseResponse.class));
            });
            return new ResponseEntity<List<StudentCourseResponse>>(studentCourseResponses, HttpStatus.OK);
        } catch(PersistenceException e) {
            throw new CustomException("Some error", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    public ResponseEntity<CustomResponse> deleteCourse(int id) {
        if (studentCourseRepository.existsById(id)) {
            studentCourseRepository.deleteById(id);
            return new ResponseEntity<CustomResponse>(new CustomResponse("Delete course id: " + id + " successful"), HttpStatus.CREATED);
        } else {
            throw new CustomException("Id doesn't exist", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }
}
