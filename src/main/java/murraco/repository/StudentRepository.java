package murraco.repository;

import murraco.domain.Student;
import murraco.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByUser(User user);
    int countByUser(User user);
}
