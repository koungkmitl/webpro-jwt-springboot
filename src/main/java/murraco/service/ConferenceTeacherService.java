package murraco.service;

import murraco.dto.CustomResponse;
import murraco.dto.RequestConferenceDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class ConferenceTeacherService {

    public ResponseEntity<CustomResponse> add(RequestConferenceDto requestConferenceDto, HttpServletRequest req){

        return new ResponseEntity<CustomResponse>(new CustomResponse(""), HttpStatus.CREATED);
    }
}
