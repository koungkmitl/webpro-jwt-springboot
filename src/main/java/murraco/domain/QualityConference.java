package murraco.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "quality_conference_type") // ccr, cif, scopus, sjr
public class QualityConference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer level;

    @OneToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;

    public Integer getId() {
        return id;
    }

    public QualityConference setId(Integer id) {
        this.id = id;
        return this;
    }

    public Conference getConference() {
        return conference;
    }

    public QualityConference setConference(Conference conference) {
        this.conference = conference;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public QualityConference setLevel(Integer level) {
        this.level = level;
        return this;
    }
}
