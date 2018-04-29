package murraco.service;

import murraco.domain.Conference;
import murraco.domain.User;
import murraco.domain_enum.State;
import murraco.dto.StatResponse;
import murraco.repository.ConferenceRepository;
import murraco.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class StatService {

    @Autowired
    private ConferenceRepository conferenceRepository;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<StatResponse> statView(HttpServletRequest req){
        int countPass = 0;
        float sumMoney = 0;
        StatResponse statResponse = new StatResponse();
        User user = userRepository.findByUsername(tokenService.getUsername(req));
        List<Conference> conferences = conferenceRepository.findAllByUser(user);
        for (Conference conference: conferences) {
            if ( conference.getState().equals(State.PASS) ){
                countPass++;
            }
            sumMoney += conference.getMaximumMoneySupport();
        }
        statResponse.setAllRequireMoney(sumMoney);
        statResponse.setAmountJournal(conferences.size());
        statResponse.setPassJournal(countPass);
        return new ResponseEntity<StatResponse>(statResponse, HttpStatus.OK);
    }
}
