package murraco.service;

import murraco.domain.Conference;
import murraco.domain.Student;
import murraco.dto.ConferenceDto;
import murraco.dto.TestDto;
import murraco.repository.ConferenceRepository;
import murraco.repository.StudentRepository;
import murraco.repository.TeacherRepository;
import murraco.response.CustomResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service
public class ConferenceService {

    @Autowired
    private ConferenceRepository conferenceRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Student add(Student student) {
        studentRepository.save(student);
        return student;
    }

    //return conference

    //return teacher


    //return student


    //return quality conference


    //handle image




//    public ResponseEntity<CustomResponse> addConference(ConferenceDto conferenceDto) {
//
//    }
}
