package murraco.service;

import javax.servlet.http.HttpServletRequest;

import murraco.dto.UserResponse;
import murraco.dto.UserSignIn;
import murraco.dto.CustomResponse;
import murraco.dto.RoleResponse;
import murraco.dto.TokenResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import murraco.exception.CustomException;
import murraco.domain.User;
import murraco.repository.UserRepository;
import murraco.security.JwtTokenProvider;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<TokenResponse> signin(UserSignIn userSignIn) {
        try {
            User user = userRepository.findByUsername(userSignIn.getUsername());
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userSignIn.getUsername(), userSignIn.getPassword()));
            TokenResponse tokenResponse = new TokenResponse(jwtTokenProvider.createToken(userSignIn.getUsername(), userRepository.findByUsername(userSignIn.getUsername()).getRoles()));
            tokenResponse.setPrefixName(user.getPrefixName());
            tokenResponse.setFirstname(user.getFirstname());
            tokenResponse.setLastname(user.getLastname());
            return new ResponseEntity<TokenResponse>(tokenResponse, HttpStatus.OK);

        } catch (AuthenticationException e) {
            throw new CustomException("Invalid username/password supplied", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    public ResponseEntity<CustomResponse> signup(User user) {
        if (!userRepository.existsByUsername(user.getUsername())) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepository.save(user);
            return new ResponseEntity<CustomResponse>(new CustomResponse("Just created"), HttpStatus.CREATED);
        } else {
            throw new CustomException("Username is already in use", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    /**
     * ADMIN
     * @param username
     * @return
     */
    public ResponseEntity<CustomResponse> delete(String username) {
        if (userRepository.existsByUsername(username)) {
            userRepository.deleteByUsername(username);
            return new ResponseEntity<CustomResponse>(new CustomResponse("Successfull to delete username: '" + username + "'"), HttpStatus.ACCEPTED);
        } else {
            throw new CustomException("The user doesn't exist", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    /**
     * ADMIN
     * @param username
     * @return
     */
    public User search(String username) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new CustomException("The user doesn't exist", HttpStatus.NOT_FOUND);
        }
        return user;
    }


    /**
     * ADMIN
     * @return
     */
    public List<UserResponse> findAllNotPassword() {
        List<UserResponse> userResponses = new ArrayList<>();
        List<User> user = userRepository.findAll();
        user.forEach((users) -> {
            userResponses.add(modelMapper.map(users, UserResponse.class));
        });
        return userResponses;
    }

    public ResponseEntity<RoleResponse> whoami(HttpServletRequest req) {
        return new ResponseEntity<RoleResponse>(new RoleResponse(tokenService.getRole(req)), HttpStatus.OK);
    }

}
