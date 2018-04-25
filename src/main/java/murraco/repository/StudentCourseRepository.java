package murraco.repository;

import murraco.domain.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, Integer>{

    void deleteById(int id);
}
