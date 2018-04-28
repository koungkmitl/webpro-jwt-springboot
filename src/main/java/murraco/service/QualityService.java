package murraco.service;

import murraco.domain.Ccr;
import murraco.domain.Cif;
import murraco.domain.Scopus;
import murraco.domain.Sjr;
import murraco.dto.RequestConferenceDto;
import murraco.repository.CcrRepository;
import murraco.repository.CifRepository;
import murraco.repository.ScopusRepository;
import murraco.repository.SjrRepository;
import murraco.dto.CustomResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QualityService {
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

    public ResponseEntity<CustomResponse> addCif(RequestConferenceDto requestConferenceDto) {
        Cif cif = modelMapper.map(requestConferenceDto, Cif.class);
        cifRepository.save(cif);
        return new ResponseEntity<CustomResponse>(new CustomResponse("CIF created"), HttpStatus.CREATED);
    }

    public ResponseEntity<CustomResponse> addSjr(RequestConferenceDto requestConferenceDto) {
        Sjr sjr = modelMapper.map(requestConferenceDto, Sjr.class);
        sjrRepository.save(sjr);
        return new ResponseEntity<CustomResponse>(new CustomResponse("SJR created"), HttpStatus.CREATED);
    }

    public ResponseEntity<CustomResponse> addScopus(RequestConferenceDto requestConferenceDto) {
        Scopus scopus = modelMapper.map(requestConferenceDto, Scopus.class);
        scopusRepository.save(scopus);
        return new ResponseEntity<CustomResponse>(new CustomResponse("SCOPUS created"), HttpStatus.CREATED);
    }

    public ResponseEntity<CustomResponse> addCcr(RequestConferenceDto requestConferenceDto) {
        Ccr ccr = modelMapper.map(requestConferenceDto, Ccr.class);
        ccrRepository.save(ccr);
        return new ResponseEntity<CustomResponse>(new CustomResponse("CCR created"), HttpStatus.CREATED);
    }
}
