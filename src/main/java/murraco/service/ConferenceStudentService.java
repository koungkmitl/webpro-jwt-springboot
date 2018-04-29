package murraco.service;

import murraco.repository.ConferenceRepository;
import murraco.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConferenceStudentService {

    private final StudentRepository studentRepository;
    private final ConferenceRepository conferenceRepository;

    @Autowired
    public ConferenceStudentService (StudentRepository studentRepository, ConferenceRepository conferenceRepository) {
        this.studentRepository = studentRepository;
        this.conferenceRepository = conferenceRepository;
    }
}
