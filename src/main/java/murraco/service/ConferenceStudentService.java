package murraco.service;

import murraco.domain.*;
import murraco.dto.CustomResponse;
import murraco.dto.RequestConferenceDto;
import murraco.dto.StudentConferenceResponse;
import murraco.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class ConferenceStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    @Autowired
    private ConferenceRepository conferenceRepository;

    @Autowired
    private SjrRepository sjrRepository;

    @Autowired
    private CcrRepository ccrRepository;

    @Autowired
    private ScopusRepository scopusRepository;

    public ResponseEntity<CustomResponse> add(RequestConferenceDto requestConferenceDto, HttpServletRequest req){
        User user = userRepository.findByUsername(tokenService.getUsername(req));

        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        Student student = modelMapper.map(requestConferenceDto, Student.class);

        StudentCourse studentCourse = studentCourseRepository.findOne(requestConferenceDto.getStudentCourse());

        student.setUser(user);
        student.setQualityConference(null);
        student.setComments(null);
        student.setImages(null);
        student.setStudentCourse(studentCourse);

        studentRepository.save(student);

        Conference conference = conferenceRepository.findOne(student.getId());

        final String typeQuaCon = requestConferenceDto.getQualityConferenceType();

        if ( typeQuaCon.equals("sjr") ) {
            Sjr sjr = modelMapper.map(requestConferenceDto, Sjr.class);
            sjr.setConference(conference);
            sjrRepository.save(sjr);
        } else if ( typeQuaCon.equals("ccr") ) {
            Ccr ccr = modelMapper.map(requestConferenceDto, Ccr.class);
            ccr.setConference(conference);
            ccrRepository.save(ccr);
        } else if ( typeQuaCon.equals("scopus") ) {
            Scopus scopus = modelMapper.map(requestConferenceDto, Scopus.class);
            scopus.setConference(conference);
            scopusRepository.save(scopus);
        }

        return new ResponseEntity<CustomResponse>(new CustomResponse("Create complete"), HttpStatus.CREATED);
    }

    public ResponseEntity<StudentConferenceResponse> list(HttpServletRequest req){
        User user = userRepository.findByUsername(tokenService.getUsername(req));
        int amount = studentRepository.countByUser(user);
        List<Student> students = studentRepository.findByUser(user);

        return new ResponseEntity<StudentConferenceResponse>(new StudentConferenceResponse(students, amount), HttpStatus.OK);
    }

}
