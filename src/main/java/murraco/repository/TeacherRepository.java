package murraco.repository;

import murraco.domain.Teacher;
import murraco.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    int countByUser(User user);

    List<Teacher> findAllByUser(User user);

    Teacher findOneByUser(User user);
}
