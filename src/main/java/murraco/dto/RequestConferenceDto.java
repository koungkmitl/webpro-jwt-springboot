package murraco.dto;

import murraco.domain_enum.State;
import murraco.domain_enum.TypePublic;
import murraco.domain_enum.TypeScopus;

import java.util.Date;

public class RequestConferenceDto {

    //Student
    private boolean scholarship;
    private float costTravel;
    private String studentUserEmail;
    private String number;
    private String subRoad;
    private String road;
    private String district;
    private String subProvince;
    private String province;
    private String postcode;
    private String identificationNumber;
    private String phoneNumber;
    private String degree;
    private String teacherEmail;
    private int studentCourse;                // setter

    //conference
    private State state;
    private String researchName;
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
    private int userId;                        // setter

    //quality conference
    private String qualityConferenceType;      // set here discriminator | ccr, cif, scopus, sjr
    private int level;
    private int conferenceId;                  // setter


    //ccr
    private int rank;

    //cif
    private int hIndex;
    private int citationTotal;

    //scopus
    private TypeScopus typeScopus;

    //sjr
    private Integer hIndexYear;
    private Integer sjrYear;
    private Float sjrScore;
    //hIndex using 2 table | CIF and SJR


    // Getter Setter
    public boolean isScholarship() {
        return scholarship;
    }

    public RequestConferenceDto setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
        return this;
    }

    public float getCostTravel() {
        return costTravel;
    }

    public RequestConferenceDto setCostTravel(float costTravel) {
        this.costTravel = costTravel;
        return this;
    }

    public String getStudentUserEmail() {
        return studentUserEmail;
    }

    public RequestConferenceDto setStudentUserEmail(String studentUserEmail) {
        this.studentUserEmail = studentUserEmail;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public RequestConferenceDto setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getSubRoad() {
        return subRoad;
    }

    public RequestConferenceDto setSubRoad(String subRoad) {
        this.subRoad = subRoad;
        return this;
    }

    public String getRoad() {
        return road;
    }

    public RequestConferenceDto setRoad(String road) {
        this.road = road;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public RequestConferenceDto setDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getSubProvince() {
        return subProvince;
    }

    public RequestConferenceDto setSubProvince(String subProvince) {
        this.subProvince = subProvince;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public RequestConferenceDto setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getPostcode() {
        return postcode;
    }

    public RequestConferenceDto setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public RequestConferenceDto setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public RequestConferenceDto setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getDegree() {
        return degree;
    }

    public RequestConferenceDto setDegree(String degree) {
        this.degree = degree;
        return this;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public RequestConferenceDto setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
        return this;
    }

    public int getStudentCourse() {
        return studentCourse;
    }

    public RequestConferenceDto setStudentCourse(int studentCourse) {
        this.studentCourse = studentCourse;
        return this;
    }

    public State getState() {
        return state;
    }

    public RequestConferenceDto setState(State state) {
        this.state = state;
        return this;
    }

    public String getResearchName() {
        return researchName;
    }

    public RequestConferenceDto setResearchName(String researchName) {
        this.researchName = researchName;
        return this;
    }

    public TypePublic getTypePublics() {
        return typePublics;
    }

    public RequestConferenceDto setTypePublics(TypePublic typePublics) {
        this.typePublics = typePublics;
        return this;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public RequestConferenceDto setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public RequestConferenceDto setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public RequestConferenceDto setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getPlace() {
        return place;
    }

    public RequestConferenceDto setPlace(String place) {
        this.place = place;
        return this;
    }

    public Date getStarTravelDate() {
        return starTravelDate;
    }

    public RequestConferenceDto setStarTravelDate(Date starTravelDate) {
        this.starTravelDate = starTravelDate;
        return this;
    }

    public Date getEndTravelDate() {
        return endTravelDate;
    }

    public RequestConferenceDto setEndTravelDate(Date endTravelDate) {
        this.endTravelDate = endTravelDate;
        return this;
    }

    public float getCostAbode() {
        return costAbode;
    }

    public RequestConferenceDto setCostAbode(float costAbode) {
        this.costAbode = costAbode;
        return this;
    }

    public float getCostRegister() {
        return costRegister;
    }

    public RequestConferenceDto setCostRegister(float costRegister) {
        this.costRegister = costRegister;
        return this;
    }

    public float getMaximumMoneySupport() {
        return maximumMoneySupport;
    }

    public RequestConferenceDto setMaximumMoneySupport(float maximumMoneySupport) {
        this.maximumMoneySupport = maximumMoneySupport;
        return this;
    }

    public int getLevelOfConference() {
        return levelOfConference;
    }

    public RequestConferenceDto setLevelOfConference(int levelOfConference) {
        this.levelOfConference = levelOfConference;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public RequestConferenceDto setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public String getQualityConferenceType() {
        return qualityConferenceType;
    }

    public RequestConferenceDto setQualityConferenceType(String qualityConferenceType) {
        this.qualityConferenceType = qualityConferenceType;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public RequestConferenceDto setLevel(int level) {
        this.level = level;
        return this;
    }

    public int getConferenceId() {
        return conferenceId;
    }

    public RequestConferenceDto setConferenceId(int conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }

    public int getRank() {
        return rank;
    }

    public RequestConferenceDto setRank(int rank) {
        this.rank = rank;
        return this;
    }

    public int gethIndex() {
        return hIndex;
    }

    public RequestConferenceDto sethIndex(int hIndex) {
        this.hIndex = hIndex;
        return this;
    }

    public int getCitationTotal() {
        return citationTotal;
    }

    public RequestConferenceDto setCitationTotal(int citationTotal) {
        this.citationTotal = citationTotal;
        return this;
    }

    public TypeScopus getTypeScopus() {
        return typeScopus;
    }

    public RequestConferenceDto setTypeScopus(TypeScopus typeScopus) {
        this.typeScopus = typeScopus;
        return this;
    }

    public Integer gethIndexYear() {
        return hIndexYear;
    }

    public RequestConferenceDto sethIndexYear(Integer hIndexYear) {
        this.hIndexYear = hIndexYear;
        return this;
    }

    public Integer getSjrYear() {
        return sjrYear;
    }

    public RequestConferenceDto setSjrYear(Integer sjrYear) {
        this.sjrYear = sjrYear;
        return this;
    }

    public Float getSjrScore() {
        return sjrScore;
    }

    public RequestConferenceDto setSjrScore(Float sjrScore) {
        this.sjrScore = sjrScore;
        return this;
    }

}
