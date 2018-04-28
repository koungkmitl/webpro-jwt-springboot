package murraco.repository;

import murraco.domain.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, Integer>{

    @Transactional
    void deleteById(int id);

    boolean existsById(int id);
}
