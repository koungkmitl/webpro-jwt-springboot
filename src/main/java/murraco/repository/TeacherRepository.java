package murraco.repository;

import murraco.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
