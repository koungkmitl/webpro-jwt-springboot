package murraco.service.bootstrapper;

import murraco.domain.Student;
import murraco.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class StudentBootstrapper implements Bootstrapper {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentBootstrapper.class);

    @Override
    public void bootstrap() {
        LOGGER.info("Running... StudentBootstrapper.class");
        List<Student> students = Arrays.asList(
                new Student().setDistrict("district").setProvince("nonthaburi"),
                new Student().setDistrict("asasasd").setProvince("bangkok")
        );

    }
}
