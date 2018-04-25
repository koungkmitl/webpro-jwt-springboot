package murraco.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ccr extends QualityConference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

}
