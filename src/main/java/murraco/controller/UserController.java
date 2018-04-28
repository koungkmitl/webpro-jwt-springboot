package murraco.controller;

import javax.servlet.http.HttpServletRequest;

import murraco.dto.UserSignIn;
import murraco.dto.CustomResponse;
import murraco.dto.RoleResponse;
import murraco.dto.TokenResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import murraco.dto.UserResponse;
import murraco.domain.User;
import murraco.service.UserService;

import java.util.List;

@RestController
@CrossOrigin( origins = "http://161.246.38.104:3000")
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping(value = "/{username}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public UserResponse search(@PathVariable String username) {
        return modelMapper.map(userService.search(username), UserResponse.class);
    }

    @PostMapping(value = "/signup")
    public ResponseEntity<CustomResponse> singup(@RequestBody User user) {
        return userService.signup(user);
    }

    @PostMapping(value = "/signin")
    public ResponseEntity<TokenResponse> signin(@RequestBody UserSignIn userSignIn) {
        return userService.signin(userSignIn);
    }

    @DeleteMapping(value = "/{username}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<CustomResponse> delete(@PathVariable String username) {
        return userService.delete(username);
    }

    @GetMapping()
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public List<UserResponse> findAllNotPassword() {
        return userService.findAllNotPassword();
    }

    @GetMapping(value = "/me")
    public ResponseEntity<RoleResponse> whoami(HttpServletRequest req) {
        return userService.whoami(req);
    }
}
