package murraco.repository;

import murraco.domain.Conference;
import murraco.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ConferenceRepository extends JpaRepository<Conference, Integer>{
    List<Conference> findAllByUser(User user);
}
