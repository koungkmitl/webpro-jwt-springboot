package murraco.service;

import murraco.domain.*;
import murraco.dto.ConferenceDto;
import murraco.dto.CustomResponse;
import murraco.dto.RequestConferenceDto;
import murraco.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;

@Service
public class ConferenceTeacherService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private ConferenceRepository conferenceRepository;

    @Autowired
    private CifRepository cifRepository;

    @Autowired
    private SjrRepository sjrRepository;

    @Autowired
    private ScopusRepository scopusRepository;

    @Autowired
    private CcrRepository ccrRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<CustomResponse> add(RequestConferenceDto requestConferenceDto, HttpServletRequest req){
        User user = userRepository.findByUsername(tokenService.getUsername(req));

        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        Teacher teacher = modelMapper.map(requestConferenceDto, Teacher.class);

        teacher.setUser(user);
        teacher.setQualityConference(null);
        teacher.setComments(null);
        teacher.setImages(null);

        teacherRepository.save(teacher);

        Conference conference = conferenceRepository.findOne(teacher.getId());

        final String typeQuaCon = requestConferenceDto.getQualityConferenceType();

        if (typeQuaCon.equals("cif")) {
            Cif cif = modelMapper.map(requestConferenceDto, Cif.class);
            cif.setConference(conference);
            cifRepository.save(cif);
        } else if ( typeQuaCon.equals("sjr") ) {
            Sjr sjr = modelMapper.map(requestConferenceDto, Sjr.class);
            sjr.setConference(conference);
            sjrRepository.save(sjr);
        } else if ( typeQuaCon.equals("scopus") ) {
            Scopus scopus = modelMapper.map(requestConferenceDto, Scopus.class);
            scopus.setConference(conference);
            scopusRepository.save(scopus);
        } else if ( typeQuaCon.equals("ccr") ) {
            Ccr ccr = modelMapper.map(requestConferenceDto, Ccr.class);
            ccr.setConference(conference);
            ccrRepository.save(ccr);
        }

        return new ResponseEntity<CustomResponse>(new CustomResponse(""), HttpStatus.CREATED);
    }

    public ResponseEntity<CustomResponse> list(HttpServletRequest req){
        User user = userRepository.findByUsername(tokenService.getUsername(req));

        return new ResponseEntity<CustomResponse>(new CustomResponse(""), HttpStatus.CREATED);
    }
}
