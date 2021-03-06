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

    //Teacher
    private Date sentResearchDate;
    private Date dateResultConsider;
    private Date lastDateRegister;
    private int numberOfJournal;
    private float costPerJournal;
    private String flightDestination;
    private float flightCost;
    private float airportVat;
    private int abodeNight;
    private float abodePerNight;
    private int allowanceDay;
    private float allowancePerDay;
    private float costOfTravelInForeign;
    private float costOfTravelInDomestic;
    private float sumAllCost;
    private Date date;

    //conference
    private State state;
    private String researchName;
    private TypePublic typePublics;
    private String conferenceName;
    private Date startDate;
    private Date endDate;
    private String place;
    private Date startTravelDate;
    private Date endTravelDate;
    private float costAbode;
    private float costRegister;
    private float maximumMoneySupport;
    private String levelOfConference;
    private String conferenceTypeDoc;
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

    public Date getStartTravelDate() {
        return startTravelDate;
    }

    public RequestConferenceDto setStartTravelDate(Date startTravelDate) {
        this.startTravelDate = startTravelDate;
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

    public String getLevelOfConference() {
        return levelOfConference;
    }

    public RequestConferenceDto setLevelOfConference(String levelOfConference) {
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

    public String getConferenceTypeDoc() {
        return conferenceTypeDoc;
    }

    public void setConferenceTypeDoc(String conferenceTypeDoc) {
        this.conferenceTypeDoc = conferenceTypeDoc;
    }

    public Date getSentResearchDate() {
        return sentResearchDate;
    }

    public void setSentResearchDate(Date sentResearchDate) {
        this.sentResearchDate = sentResearchDate;
    }

    public Date getDateResultConsider() {
        return dateResultConsider;
    }

    public void setDateResultConsider(Date dateResultConsider) {
        this.dateResultConsider = dateResultConsider;
    }

    public Date getLastDateRegister() {
        return lastDateRegister;
    }

    public void setLastDateRegister(Date lastDateRegister) {
        this.lastDateRegister = lastDateRegister;
    }

    public int getNumberOfJournal() {
        return numberOfJournal;
    }

    public void setNumberOfJournal(int numberOfJournal) {
        this.numberOfJournal = numberOfJournal;
    }

    public float getCostPerJournal() {
        return costPerJournal;
    }

    public void setCostPerJournal(float costPerJournal) {
        this.costPerJournal = costPerJournal;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public float getFlightCost() {
        return flightCost;
    }

    public void setFlightCost(float flightCost) {
        this.flightCost = flightCost;
    }

    public float getAirportVat() {
        return airportVat;
    }

    public void setAirportVat(float airportVat) {
        this.airportVat = airportVat;
    }

    public int getAbodeNight() {
        return abodeNight;
    }

    public void setAbodeNight(int abodeNight) {
        this.abodeNight = abodeNight;
    }

    public float getAbodePerNight() {
        return abodePerNight;
    }

    public void setAbodePerNight(float abodePerNight) {
        this.abodePerNight = abodePerNight;
    }

    public int getAllowanceDay() {
        return allowanceDay;
    }

    public void setAllowanceDay(int allowanceDay) {
        this.allowanceDay = allowanceDay;
    }

    public float getAllowancePerDay() {
        return allowancePerDay;
    }

    public void setAllowancePerDay(float allowancePerDay) {
        this.allowancePerDay = allowancePerDay;
    }

    public float getCostOfTravelInForeign() {
        return costOfTravelInForeign;
    }

    public void setCostOfTravelInForeign(float costOfTravelInForeign) {
        this.costOfTravelInForeign = costOfTravelInForeign;
    }

    public float getCostOfTravelInDomestic() {
        return costOfTravelInDomestic;
    }

    public void setCostOfTravelInDomestic(float costOfTravelInDomestic) {
        this.costOfTravelInDomestic = costOfTravelInDomestic;
    }

    public float getSumAllCost() {
        return sumAllCost;
    }

    public void setSumAllCost(float sumAllCost) {
        this.sumAllCost = sumAllCost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
