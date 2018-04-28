package murraco.repository;

import murraco.domain.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Integer>{

    int countByUserId(int id);
}
