package murraco.domain;

import murraco.domain_enum.LevelOfConference;
import murraco.domain_enum.State;
import murraco.domain_enum.TypePublic;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "conference_type_doc") //student, teacher
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private State state;
    private String researchName;
    @Enumerated(EnumType.STRING)
    private TypePublic typePublics;
    private String conferenceName;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date startDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date endDate;
    private String place;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date startTravelDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date endTravelDate;
    private float costAbode;
    private float costRegister;
    private float maximumMoneySupport;
    @Enumerated(EnumType.STRING)
    private LevelOfConference levelOfConference;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
    private List<Comment> comments;

    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
    private List<Image> images;

    @OneToOne(mappedBy = "conference", cascade = CascadeType.ALL)
    private QualityConference qualityConference;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getResearchName() {
        return researchName;
    }

    public void setResearchName(String researchName) {
        this.researchName = researchName;
    }

    public TypePublic getTypePublics() {
        return typePublics;
    }

    public void setTypePublics(TypePublic typePublics) {
        this.typePublics = typePublics;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getStartTravelDate() {
        return startTravelDate;
    }

    public void setStartTravelDate(Date startTravelDate) {
        this.startTravelDate = startTravelDate;
    }

    public Date getEndTravelDate() {
        return endTravelDate;
    }

    public void setEndTravelDate(Date endTravelDate) {
        this.endTravelDate = endTravelDate;
    }

    public float getCostAbode() {
        return costAbode;
    }

    public void setCostAbode(float costAbode) {
        this.costAbode = costAbode;
    }

    public float getCostRegister() {
        return costRegister;
    }

    public void setCostRegister(float costRegister) {
        this.costRegister = costRegister;
    }

    public float getMaximumMoneySupport() {
        return maximumMoneySupport;
    }

    public void setMaximumMoneySupport(float maximumMoneySupport) {
        this.maximumMoneySupport = maximumMoneySupport;
    }

    public LevelOfConference getLevelOfConference() {
        return levelOfConference;
    }

    public void setLevelOfConference(LevelOfConference levelOfConference) {
        this.levelOfConference = levelOfConference;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public QualityConference getQualityConference() {
        return qualityConference;
    }

    public void setQualityConference(QualityConference qualityConference) {
        this.qualityConference = qualityConference;
    }

    public Conference() {
    }
}
