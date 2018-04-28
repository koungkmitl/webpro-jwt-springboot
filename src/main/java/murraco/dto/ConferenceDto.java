package murraco.dto;

import murraco.domain.User;
import murraco.domain_enum.State;
import murraco.domain_enum.TypePublic;

import javax.persistence.Entity;
import java.util.Date;

public class ConferenceDto {

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
    private User user;                        // setter

    public State getState() {
        return state;
    }

    public ConferenceDto setState(State state) {
        this.state = state;
        return this;
    }

    public String getResearchName() {
        return researchName;
    }

    public ConferenceDto setResearchName(String researchName) {
        this.researchName = researchName;
        return this;
    }

    public TypePublic getTypePublics() {
        return typePublics;
    }

    public ConferenceDto setTypePublics(TypePublic typePublics) {
        this.typePublics = typePublics;
        return this;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public ConferenceDto setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public ConferenceDto setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public ConferenceDto setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getPlace() {
        return place;
    }

    public ConferenceDto setPlace(String place) {
        this.place = place;
        return this;
    }

    public Date getStarTravelDate() {
        return starTravelDate;
    }

    public ConferenceDto setStarTravelDate(Date starTravelDate) {
        this.starTravelDate = starTravelDate;
        return this;
    }

    public Date getEndTravelDate() {
        return endTravelDate;
    }

    public ConferenceDto setEndTravelDate(Date endTravelDate) {
        this.endTravelDate = endTravelDate;
        return this;
    }

    public float getCostAbode() {
        return costAbode;
    }

    public ConferenceDto setCostAbode(float costAbode) {
        this.costAbode = costAbode;
        return this;
    }

    public float getCostRegister() {
        return costRegister;
    }

    public ConferenceDto setCostRegister(float costRegister) {
        this.costRegister = costRegister;
        return this;
    }

    public float getMaximumMoneySupport() {
        return maximumMoneySupport;
    }

    public ConferenceDto setMaximumMoneySupport(float maximumMoneySupport) {
        this.maximumMoneySupport = maximumMoneySupport;
        return this;
    }

    public int getLevelOfConference() {
        return levelOfConference;
    }

    public ConferenceDto setLevelOfConference(int levelOfConference) {
        this.levelOfConference = levelOfConference;
        return this;
    }

    public User getUser() {
        return user;
    }

    public ConferenceDto setUser(User user) {
        this.user = user;
        return this;
    }

}
