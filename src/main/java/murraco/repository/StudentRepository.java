package murraco.repository;

import murraco.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
//    List<Student> findAll();
//
//    List<Student> findAll
}
