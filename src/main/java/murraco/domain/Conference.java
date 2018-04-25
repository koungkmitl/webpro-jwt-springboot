package murraco.domain;

import murraco.domain_enum.State;
import murraco.domain_enum.TypeDoc;
import murraco.domain_enum.TypePublic;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(
        discriminatorType = DiscriminatorType.INTEGER,
        name = "conference_type_doc_id",
        columnDefinition = "TINYINT(1)"
)
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String testConferencce;
//    @Enumerated(EnumType.STRING)
//    private State state;
//    private String researchName;
//    @Enumerated(EnumType.STRING)
//    private TypePublic typePublics;
//    private String conferenceName;
//    private Date startDate;
//    private Date endDate;
//    private String place;
//    private Date starTravelDate;
//    private Date endTravelDate;
//    private float costAbode;
//    private float costRegister;
//    private float maximumMoneySupport;
//    private int levelOfConference;
//    @Enumerated(EnumType.STRING)
//    private TypeDoc typeDocs;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

//    @OneToOne(mappedBy = "conference", cascade = CascadeType.ALL)
//    private Teacher teacher;
//
//    @OneToOne(mappedBy = "conference", cascade = CascadeType.ALL)
//    private Student student;

    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
    private List<Comment> comments;

    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
    private List<Image> images;

    @OneToOne(mappedBy = "conference", cascade = CascadeType.ALL)
    private QualityConference qualityConference;
}
