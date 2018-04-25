package murraco.domain;

import murraco.domain_enum.TypeConference;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(
        discriminatorType = DiscriminatorType.INTEGER,
        name = "quality_conference_id",
        columnDefinition = "TINYINT(1)"
)
public class QualityConference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private TypeConference typeConference;

    @OneToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;

//    @OneToOne(mappedBy = "qualityConference")
//    private Scopus scopus;

//    @OneToOne(mappedBy = "qualityConference")
//    private Ccr ccr;

//    @OneToOne(mappedBy = "qualityConference")
//    private Cif cif;
//
//    @OneToOne(mappedBy = "qualityConference")
//    private Sjr sjr;
}
