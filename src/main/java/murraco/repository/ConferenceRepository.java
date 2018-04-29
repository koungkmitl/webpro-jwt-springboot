package murraco.repository;

import murraco.domain.Conference;
import murraco.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference, Integer>{

    int countByUser(User user);

    List<Conference> findByUser(User user);
}
