package murraco.service;

import murraco.domain.User;
import murraco.domain_enum.Role;
import murraco.exception.CustomException;
import murraco.repository.UserRepository;
import murraco.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.persistence.PersistenceException;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class TokenService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    public Long getUserId(HttpServletRequest req) {
        try {
            User user = userRepository.findByUsername(jwtTokenProvider.getUsername(jwtTokenProvider.resolveToken(req)));
            return user.getId();
        } catch (PersistenceException e) {
            throw new CustomException("The user doesn't exist", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    public List<Role> getRole(HttpServletRequest req) {
        try {
            User user = userRepository.findByUsername(jwtTokenProvider.getUsername(jwtTokenProvider.resolveToken(req)));
            return user.getRoles();
        } catch (PersistenceException e) {
            throw new CustomException("The user doesn't exist", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    public String getUsername(HttpServletRequest req) {
        try {
            return jwtTokenProvider.getUsername(jwtTokenProvider.resolveToken(req));
        } catch (PersistenceException e) {
            throw new CustomException("The user doesn't exist", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }
}
