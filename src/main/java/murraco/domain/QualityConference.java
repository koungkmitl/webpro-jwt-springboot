package murraco.domain;

import murraco.domain_enum.TypeConference;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "quality_conference_type")
public class QualityConference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private TypeConference typeConference;

    @OneToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;

}
