package murraco.controller;

import javax.servlet.http.HttpServletRequest;

import murraco.dto.UserDTO;
import murraco.response.CustomResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.dto.UserResponseDTO;
import murraco.model.User;
import murraco.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

//  @Autowired
//  private ModelMapper modelMapper;

//  @PostMapping("/signin")
//  @ApiOperation(value = "${UserController.signin}")
//  @ApiResponses(value = {//
//      @ApiResponse(code = 400, message = "Something went wrong"), //
//      @ApiResponse(code = 422, message = "Invalid username/password supplied")})
//  public String login(//
//      @ApiParam("Username") @RequestParam String username, //
//      @ApiParam("Password") @RequestParam String password) {
//    return userService.signin(username, password);
//  }

//  @PostMapping("/signup")
//  @ApiOperation(value = "${UserController.signup}")
//  @ApiResponses(value = {//
//      @ApiResponse(code = 400, message = "Something went wrong"), //
//      @ApiResponse(code = 403, message = "Access denied"), //
//      @ApiResponse(code = 422, message = "Username is already in use"), //
//      @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
//  public String signup(@ApiParam("Signup User") @RequestBody UserDataDTO user) {
//    return userService.signup(modelMapper.map(user, User.class));
//  }

//  @DeleteMapping(value = "/{username}")
//  @PreAuthorize("hasRole('ROLE_ADMIN')")
//  @ApiOperation(value = "${UserController.delete}")
//  @ApiResponses(value = {//
//      @ApiResponse(code = 400, message = "Something went wrong"), //
//      @ApiResponse(code = 403, message = "Access denied"), //
//      @ApiResponse(code = 404, message = "The user doesn't exist"), //
//      @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
//  public String delete(@ApiParam("Username") @PathVariable String username) {
//    userService.delete(username);
//    return username;
//  }
//
//  @GetMapping(value = "/{username}")
//  @PreAuthorize("hasRole('ROLE_ADMIN')")
//  @ApiOperation(value = "${UserController.search}", response = UserResponseDTO.class)
//  @ApiResponses(value = {//
//      @ApiResponse(code = 400, message = "Something went wrong"), //
//      @ApiResponse(code = 403, message = "Access denied"), //
//      @ApiResponse(code = 404, message = "The user doesn't exist"), //
//      @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
//  public UserResponseDTO search(@ApiParam("Username") @PathVariable String username) {
//    return modelMapper.map(userService.search(username), UserResponseDTO.class);
//  }
//
//  @GetMapping(value = "/me")
//  @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
//  @ApiOperation(value = "${UserController.me}", response = UserResponseDTO.class)
//  @ApiResponses(value = {//
//      @ApiResponse(code = 400, message = "Something went wrong"), //
//      @ApiResponse(code = 403, message = "Access denied"), //
//      @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
//  public UserResponseDTO whoami(HttpServletRequest req) {
//    return modelMapper.map(userService.whoami(req), UserResponseDTO.class);
//  }

  @PostMapping(value="/signup")
  public String singup(@RequestBody User user) {
    return userService.signup(user);
  }

  @PostMapping(value="/signin")
  public String signin(@RequestBody UserDTO userDTO) {
    return userService.signin(userDTO);
  }

  @DeleteMapping(value = "/{username}")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public CustomResponse delete(@PathVariable String username) {
    return userService.delete(username);
  }

  @GetMapping(value="/{username}")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public User search(@PathVariable String username) {
    return userService.search(username);
  }

}
