package murraco;

import murraco.domain.StudentCourse;
import murraco.domain.User;
import murraco.domain_enum.Role;
import murraco.dto.UserSignIn;
import murraco.dto.TokenResponse;
import murraco.service.StudentCourseService;
import murraco.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class JwtAuthServiceApp implements CommandLineRunner {

    @Autowired
    UserService userService;

    @Autowired
    StudentCourseService studentCourseService;

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
        client.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_STUDENT)));

        userService.signup(client);

        User tea = new User();
        tea.setUsername("tea");
        tea.setPassword("tea");
        tea.setEmail("teacher@email.com");
        tea.setPrefixName("nai");
        tea.setFirstname("test");
        tea.setLastname("test");
        tea.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_TEACHER)));

        userService.signup(tea);

        User hr = new User();
        hr.setUsername("hr");
        hr.setPassword("hr");
        hr.setEmail("hr@email.com");
        hr.setPrefixName("nai");
        hr.setFirstname("test");
        hr.setLastname("test");
        hr.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_STAFF_HR)));

        userService.signup(hr);

        User re = new User();
        re.setUsername("re");
        re.setPassword("re");
        re.setEmail("re@email.com");
        re.setPrefixName("nai");
        re.setFirstname("test");
        re.setLastname("test");
        re.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_STAFF_RESEARCH)));

        userService.signup(re);

        User fi = new User();
        fi.setUsername("fi");
        fi.setPassword("fi");
        fi.setEmail("fi@email.com");
        fi.setPrefixName("nai");
        fi.setFirstname("test");
        fi.setLastname("test");
        fi.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_STAFF_FINANCE)));

        userService.signup(fi);

        User dor = new User();
        dor.setUsername("dor");
        dor.setPassword("dor");
        dor.setEmail("dor@email.com");
        dor.setPrefixName("nai");
        dor.setFirstname("test");
        dor.setLastname("test");
        dor.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_STAFF_DORECTOR)));

        userService.signup(dor);

        User den = new User();
        den.setUsername("den");
        den.setPassword("den");
        den.setEmail("den@email.com");
        den.setPrefixName("nai");
        den.setFirstname("test");
        den.setLastname("test");
        den.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_STAFF_DEAN)));

        userService.signup(den);

        System.out.println("-------------- admin --------------");
        UserSignIn userSignIn = new UserSignIn("admin", "admin");
        ResponseEntity<TokenResponse> tokenResponse = userService.signin(userSignIn);
        System.out.println(tokenResponse.getBody().getToken());
        System.out.println("-----------------------------------");

        System.out.println("-------------- student --------------");
        UserSignIn suserSignIn = new UserSignIn("client", "client");
        ResponseEntity<TokenResponse> stokenResponse = userService.signin(suserSignIn);
        System.out.println(stokenResponse.getBody().getToken());
        System.out.println("-----------------------------------");

        System.out.println("-------------- teacher --------------");
        UserSignIn teaSignIn = new UserSignIn("tea", "tea");
        ResponseEntity<TokenResponse> astokenResponse = userService.signin(teaSignIn);
        System.out.println(astokenResponse.getBody().getToken());
        System.out.println("-----------------------------------");

        System.out.println("-------------- hr --------------");
        UserSignIn hrSignIn = new UserSignIn("hr", "hr");
        ResponseEntity<TokenResponse> hrtokenResponse = userService.signin(hrSignIn);
        System.out.println(hrtokenResponse.getBody().getToken());
        System.out.println("-----------------------------------");

        System.out.println("-------------- re --------------");
        UserSignIn qteaSignIn = new UserSignIn("re", "re");
        ResponseEntity<TokenResponse> qastokenResponse = userService.signin(qteaSignIn);
        System.out.println(qastokenResponse.getBody().getToken());
        System.out.println("-----------------------------------");

        System.out.println("-------------- fi --------------");
        UserSignIn wteaSignIn = new UserSignIn("fi", "fi");
        ResponseEntity<TokenResponse> wastokenResponse = userService.signin(wteaSignIn);
        System.out.println(wastokenResponse.getBody().getToken());
        System.out.println("-----------------------------------");

        System.out.println("-------------- dor --------------");
        UserSignIn eteaSignIn = new UserSignIn("dor", "dor");
        ResponseEntity<TokenResponse> eastokenResponse = userService.signin(eteaSignIn);
        System.out.println(eastokenResponse.getBody().getToken());
        System.out.println("-----------------------------------");

        System.out.println("-------------- den --------------");
        UserSignIn zteaSignIn = new UserSignIn("den", "den");
        ResponseEntity<TokenResponse> zastokenResponse = userService.signin(zteaSignIn);
        System.out.println(zastokenResponse.getBody().getToken());
        System.out.println("-----------------------------------");

        studentCourseService.addCourse(new StudentCourse("normal", "it", "kmitl"));
        studentCourseService.addCourse(new StudentCourse("hello", "world", "hello, world"));
        studentCourseService.addCourse(new StudentCourse("world", "hello", "world, hello"));

    }

}
