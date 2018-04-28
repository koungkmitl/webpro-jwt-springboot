package murraco.service;

import murraco.domain.Student;
import murraco.repository.StudentRepository;
import murraco.dto.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class StudentService {
    @Autowired
    private TokenService tokenService;

    @Autowired
    private StudentRepository studentRepository;

    public ResponseEntity<CustomResponse> addStudentConference(Student student, HttpServletRequest req){
        student.setId(tokenService.getUserId(req));
        studentRepository.save(student);
        tokenService.getUserId(req);
        return new ResponseEntity<CustomResponse>(new CustomResponse(""), HttpStatus.CREATED);
    }
}
