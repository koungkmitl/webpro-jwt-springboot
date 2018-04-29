package murraco.service;

import murraco.domain.Comment;
import murraco.domain.Student;
import murraco.domain.Teacher;
import murraco.domain.User;
import murraco.domain_enum.Role;
import murraco.domain_enum.State;
import murraco.dto.CommentDto;
import murraco.dto.CustomResponse;
import murraco.repository.CommentRepository;
import murraco.repository.StudentRepository;
import murraco.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CommentRepository commentRepository;

    public ResponseEntity<List<Teacher>> teacherList(HttpServletRequest req) {
        List<Role> roles = tokenService.getRole(req);
        List<Teacher> teachers = teacherRepository.findAll();
        List<Teacher> teachersFilter = new ArrayList<Teacher>();
        for (Teacher teacher: teachers) {
            if ( roles.contains(Role.ROLE_STAFF_HR) && teacher.getState().equals(State.INIT)) {
                teachersFilter.add(teacher);
            } else if ( roles.contains(Role.ROLE_STAFF_RESEARCH) && teacher.getState().equals(State.HR_P)) {
                teachersFilter.add(teacher);
            } else if ( roles.contains(Role.ROLE_STAFF_FINANCE) && teacher.getState().equals(State.RESEARCH_P)) {
                teachersFilter.add(teacher);
            } else if ( roles.contains(Role.ROLE_STAFF_DORECTOR) && teacher.getState().equals(State.FINANCE_P)) {
                teachersFilter.add(teacher);
            } else if ( roles.contains(Role.ROLE_STAFF_DEAN) && teacher.getState().equals(State.DORETOR_P)) {
                teachersFilter.add(teacher);
            } else if ( roles.contains(Role.ROLE_STAFF_DEAN) && teacher.getState().equals(State.LETTERACCEPTANCE_P)) {
                teachersFilter.add(teacher);
            }
        }
        return new ResponseEntity<List<Teacher>>(teachersFilter, HttpStatus.OK);
    }

    public ResponseEntity<List<Student>> studentList(HttpServletRequest req) {
        List<Role> roles = tokenService.getRole(req);
        List<Student> students = studentRepository.findAll();
        List<Student> studentsFilter = new ArrayList<Student>();
        for (Student student: students) {
            if ( roles.contains(Role.ROLE_STAFF_REGISTRATION) && student.getState().equals(State.INIT)) {
                studentsFilter.add(student);
            } else if ( roles.contains(Role.ROLE_STAFF_ASSOCIATEDEAN) && student.getState().equals(State.REGISTRATION_P)) {
                studentsFilter.add(student);
            } else if ( roles.contains(Role.ROLE_STAFF_DEAN) && student.getState().equals(State.ASSOCIATEDEAN_P)) {
                studentsFilter.add(student);
            } else if ( roles.contains(Role.ROLE_STAFF_DEAN) && student.getState().equals(State.DEAN_P)) {
                studentsFilter.add(student);
            }
        }
        return new ResponseEntity<List<Student>>(studentsFilter, HttpStatus.OK);
    }

    public ResponseEntity<CustomResponse> teacherCheck(CommentDto commentDto, HttpServletRequest req) {
        User user = userService.search(tokenService.getUsername(req));
        List<Role> roles = tokenService.getRole(req);
        Teacher teacher = teacherRepository.findOne(commentDto.getConferenceId());
        Comment comment = new Comment();
        comment.setConference(teacher);
        comment.setDate(commentDto.getDate());
        comment.setUser(user);
        comment.setTextComment(commentDto.getTextComment());
//        approve
//        reject

        if ( roles.contains(Role.ROLE_STAFF_HR) && teacher.getState().equals(State.INIT) ) {
            commentRepository.save(comment);
            if ( commentDto.getCheck().equals("approve") ) {
                teacher.setState(State.HR_P);
            } else {
                teacher.setState(State.HR_F);
            }
            teacherRepository.save(teacher);
        } else if ( roles.contains(Role.ROLE_STAFF_RESEARCH) && teacher.getState().equals(State.HR_P)) {
            commentRepository.save(comment);
            if ( commentDto.getCheck().equals("approve") ) {
                teacher.setState(State.RESEARCH_P);
            } else {
                teacher.setState(State.RESEARCH_F);
            }
            teacherRepository.save(teacher);
        } else if ( roles.contains(Role.ROLE_STAFF_FINANCE) && teacher.getState().equals(State.RESEARCH_P)) {
            commentRepository.save(comment);
            if ( commentDto.getCheck().equals("approve") ) {
                teacher.setState(State.FINANCE_P);
            } else {
                teacher.setState(State.FINANCE_F);
            }
            teacherRepository.save(teacher);
        } else if ( roles.contains(Role.ROLE_STAFF_DORECTOR) && teacher.getState().equals(State.FINANCE_P)) {
            commentRepository.save(comment);
            if ( commentDto.getCheck().equals("approve") ) {
                teacher.setState(State.DORETOR_P);
            } else {
                teacher.setState(State.DORETOR_F);

            }
            teacherRepository.save(teacher);
        } else if ( roles.contains(Role.ROLE_STAFF_DEAN) && teacher.getState().equals(State.DORETOR_P)) {
            commentRepository.save(comment);
            if ( commentDto.getCheck().equals("approve") ) {
                teacher.setState(State.DEAN_P);
            } else {
                teacher.setState(State.DEAN_F);
            }
            teacherRepository.save(teacher);
        } else if ( roles.contains(Role.ROLE_STAFF_DEAN) && teacher.getState().equals(State.LETTERACCEPTANCE_P)) {
            commentRepository.save(comment);
            if ( commentDto.getCheck().equals("approve") ) {
                teacher.setState(State.PASS);
            } else {
                teacher.setState(State.DEAN_F);
            }
            teacherRepository.save(teacher);
        } else {
            return new ResponseEntity<CustomResponse>(new CustomResponse("You not approve, reject this conference"), HttpStatus.NOT_ACCEPTABLE);
        }

        return new ResponseEntity<CustomResponse>(new CustomResponse("Check complete"), HttpStatus.OK);
    }

    public ResponseEntity<CustomResponse> studentCheck(CommentDto commentDto, HttpServletRequest req) {
        User user = userService.search(tokenService.getUsername(req));
        List<Role> roles = tokenService.getRole(req);
        Student student = studentRepository.findOne(commentDto.getConferenceId());
        Comment comment = new Comment();
        comment.setConference(student);
        comment.setDate(commentDto.getDate());
        comment.setUser(user);
        comment.setTextComment(commentDto.getTextComment());
//        approve
//        reject

        if ( roles.contains(Role.ROLE_STAFF_REGISTRATION) && student.getState().equals(State.INIT)) {
            commentRepository.save(comment);
            if ( commentDto.getCheck().equals("approve") ) {
                student.setState(State.REGISTRATION_P);
            } else {
                student.setState(State.REGISTRATION_F);
            }
            studentRepository.save(student);
        } else if ( roles.contains(Role.ROLE_STAFF_ASSOCIATEDEAN) && student.getState().equals(State.REGISTRATION_P)) {
            commentRepository.save(comment);
            if ( commentDto.getCheck().equals("approve") ) {
                student.setState(State.ASSOCIATEDEAN_P);
            } else {
                student.setState(State.ASSOCIATEDEAN_F);
            }
            studentRepository.save(student);
        } else if ( roles.contains(Role.ROLE_STAFF_DEAN) && student.getState().equals(State.ASSOCIATEDEAN_P)) {
            commentRepository.save(comment);
            if ( commentDto.getCheck().equals("approve") ) {
                student.setState(State.PASS);
            } else {
                student.setState(State.DEAN_F);
            }
            studentRepository.save(student);
        } else if ( roles.contains(Role.ROLE_STAFF_DEAN) && student.getState().equals(State.DEAN_P)) {
            commentRepository.save(comment);
            if ( commentDto.getCheck().equals("approve") ) {
                student.setState(State.PASS);
            } else {
                student.setState(State.DEAN_F);
            }
            studentRepository.save(student);
        } else {
            return new ResponseEntity<CustomResponse>(new CustomResponse("You not approve, reject this conference"), HttpStatus.NOT_ACCEPTABLE);
        }

        return new ResponseEntity<CustomResponse>(new CustomResponse("Check complete"), HttpStatus.OK);
    }
}