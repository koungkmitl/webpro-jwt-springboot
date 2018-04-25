package murraco.domain;

import murraco.domain_enum.TypeScopus;

import javax.persistence.*;

@Entity
public class Scopus extends QualityConference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private TypeScopus typeScopus;

//    @OneToOne
//    @JoinColumn(name = "quality_conference_id")
//    private QualityConference qualityConference;
}
