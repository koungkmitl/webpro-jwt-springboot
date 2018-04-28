package murraco.repository;

import murraco.domain.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConferenceRepository extends JpaRepository<Conference, Integer>{

    int countByUserId(int id);

    List<Conference> findByUserId(int id);
}
