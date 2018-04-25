package murraco;

import java.util.ArrayList;
import java.util.Arrays;

import jdk.nashorn.internal.parser.Token;
import murraco.dto.UserSignIn;
import murraco.response.TokenResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import murraco.domain_enum.Role;
import murraco.domain.User;
import murraco.service.UserService;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
public class JwtAuthServiceApp implements CommandLineRunner {

  @Autowired
  UserService userService;

  public static void main(String[] args) {
    SpringApplication.run(JwtAuthServiceApp.class, args);
  }

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

  @Override
  public void run(String... params) throws Exception {
    User admin = new User();
    admin.setUsername("admin");
    admin.setPassword("admin");
    admin.setEmail("admin@email.com");
    admin.setPrefixName("nai");
    admin.setFirstname("admin");
    admin.setLastname("admin");
    admin.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_ADMIN)));

    userService.signup(admin);

    User client = new User();
    client.setUsername("client");
    client.setPassword("client");
    client.setEmail("client@email.com");
    client.setPrefixName("nai");
    client.setFirstname("client");
    client.setLastname("client");
    client.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_CLIENT)));

    userService.signup(client);

    User test = new User();
    test.setUsername("test");
    test.setPassword("test");
    test.setEmail("test@email.com");
    test.setPrefixName("nai");
    test.setFirstname("test");
    test.setLastname("test");
    test.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_CLIENT, Role.ROLE_ADMIN)));

    userService.signup(test);

    UserSignIn userSignIn = new UserSignIn("admin", "admin");
    ResponseEntity<TokenResponse> tokenResponse = userService.signin(userSignIn);
    System.out.println(tokenResponse.getBody().getToken());
  }

}
