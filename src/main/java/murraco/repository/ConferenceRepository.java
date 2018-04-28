package murraco.repository;

import murraco.domain.Conference;
import murraco.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConferenceRepository extends JpaRepository<Conference, Integer>{

    int countByUser(User user);

    List<Conference> findByUser(User user);
}
