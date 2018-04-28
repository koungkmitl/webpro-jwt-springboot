package murraco.service;

import murraco.repository.ConferenceRepository;
import murraco.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConferenceStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ConferenceRepository conferenceRepository;
}
