package murraco.repository;

import murraco.domain.Scopus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScopusRepository extends JpaRepository<Scopus, Integer> {
}
