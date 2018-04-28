package murraco.service;

import murraco.domain.Conference;
import murraco.domain.User;
import murraco.dto.ConferenceDto;
import murraco.dto.CustomResponse;
import murraco.dto.RequestConferenceDto;
import murraco.repository.ConferenceRepository;
import murraco.repository.UserRepository;
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
    private ConferenceRepository conferenceRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<CustomResponse> add(RequestConferenceDto requestConferenceDto, HttpServletRequest req){
        User user = userRepository.findByUsername(tokenService.getUsername(req));

        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        Conference conference = modelMapper.map(requestConferenceDto, Conference.class);
        conference.setUser(user);

        for (Field field : conference.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = null;
            try {
                value = field.get(conference);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            System.out.printf("%s: %s%n", name, value);
        }

        try {
            conferenceRepository.save(new ConferenceDto());
        } catch ( Exception e ) {
            System.out.println(e);
        }

        return new ResponseEntity<CustomResponse>(new CustomResponse(""), HttpStatus.CREATED);
    }

    public ResponseEntity<CustomResponse> list(HttpServletRequest req){
        User user = userRepository.findByUsername(tokenService.getUsername(req));

        return new ResponseEntity<CustomResponse>(new CustomResponse(""), HttpStatus.CREATED);
    }
}
