package murraco.domain;

import murraco.domain_enum.State;
import murraco.domain_enum.TypeDoc;
import murraco.domain_enum.TypePublic;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "conference_type_doc")
//@DiscriminatorColumn(
//        discriminatorType = DiscriminatorType.INTEGER,
//        name = "conference_type_doc_id",
//        columnDefinition = "TINYINT(1)"
//)
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private State state;
    private String researchName;
    @Enumerated(EnumType.STRING)
    private TypePublic typePublics;
    private String conferenceName;
    private Date startDate;
    private Date endDate;
    private String place;
    private Date starTravelDate;
    private Date endTravelDate;
    private float costAbode;
    private float costRegister;
    private float maximumMoneySupport;
    private int levelOfConference;
    @Enumerated(EnumType.STRING)
    private TypeDoc typeDocs;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
    private List<Comment> comments;

    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
    private List<Image> images;

    @OneToOne(mappedBy = "conference", cascade = CascadeType.ALL)
    private QualityConference qualityConference;

    public Integer getId() {
        return id;
    }

    public Conference setId(Integer id) {
        this.id = id;
        return this;
    }

    public State getState() {
        return state;
    }

    public Conference setState(State state) {
        this.state = state;
        return this;
    }

    public String getResearchName() {
        return researchName;
    }

    public Conference setResearchName(String researchName) {
        this.researchName = researchName;
        return this;
    }

    public TypePublic getTypePublics() {
        return typePublics;
    }

    public Conference setTypePublics(TypePublic typePublics) {
        this.typePublics = typePublics;
        return this;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public Conference setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Conference setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Conference setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getPlace() {
        return place;
    }

    public Conference setPlace(String place) {
        this.place = place;
        return this;
    }

    public Date getStarTravelDate() {
        return starTravelDate;
    }

    public Conference setStarTravelDate(Date starTravelDate) {
        this.starTravelDate = starTravelDate;
        return this;
    }

    public Date getEndTravelDate() {
        return endTravelDate;
    }

    public Conference setEndTravelDate(Date endTravelDate) {
        this.endTravelDate = endTravelDate;
        return this;
    }

    public float getCostAbode() {
        return costAbode;
    }

    public Conference setCostAbode(float costAbode) {
        this.costAbode = costAbode;
        return this;
    }

    public float getCostRegister() {
        return costRegister;
    }

    public Conference setCostRegister(float costRegister) {
        this.costRegister = costRegister;
        return this;
    }

    public float getMaximumMoneySupport() {
        return maximumMoneySupport;
    }

    public Conference setMaximumMoneySupport(float maximumMoneySupport) {
        this.maximumMoneySupport = maximumMoneySupport;
        return this;
    }

    public int getLevelOfConference() {
        return levelOfConference;
    }

    public Conference setLevelOfConference(int levelOfConference) {
        this.levelOfConference = levelOfConference;
        return this;
    }

    public TypeDoc getTypeDocs() {
        return typeDocs;
    }

    public Conference setTypeDocs(TypeDoc typeDocs) {
        this.typeDocs = typeDocs;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Conference setUser(User user) {
        this.user = user;
        return this;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Conference setComments(List<Comment> comments) {
        this.comments = comments;
        return this;
    }

    public List<Image> getImages() {
        return images;
    }

    public Conference setImages(List<Image> images) {
        this.images = images;
        return this;
    }

    public QualityConference getQualityConference() {
        return qualityConference;
    }

    public Conference setQualityConference(QualityConference qualityConference) {
        this.qualityConference = qualityConference;
        return this;
    }
}
