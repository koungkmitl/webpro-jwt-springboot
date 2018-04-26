package murraco.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue(value = "teacher")
public class Teacher extends Conference {

    private int qualityOfConferenceId;
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

    public int getQualityOfConferenceId() {
        return qualityOfConferenceId;
    }

    public Teacher setQualityOfConferenceId(int qualityOfConferenceId) {
        this.qualityOfConferenceId = qualityOfConferenceId;
        return this;
    }

    public Date getSentResearchDate() {
        return sentResearchDate;
    }

    public Teacher setSentResearchDate(Date sentResearchDate) {
        this.sentResearchDate = sentResearchDate;
        return this;
    }

    public Date getDateResultConsider() {
        return dateResultConsider;
    }

    public Teacher setDateResultConsider(Date dateResultConsider) {
        this.dateResultConsider = dateResultConsider;
        return this;
    }

    public Date getLastDateRegister() {
        return lastDateRegister;
    }

    public Teacher setLastDateRegister(Date lastDateRegister) {
        this.lastDateRegister = lastDateRegister;
        return this;
    }

    public int getNumberOfJournal() {
        return numberOfJournal;
    }

    public Teacher setNumberOfJournal(int numberOfJournal) {
        this.numberOfJournal = numberOfJournal;
        return this;
    }

    public float getCostPerJournal() {
        return costPerJournal;
    }

    public Teacher setCostPerJournal(float costPerJournal) {
        this.costPerJournal = costPerJournal;
        return this;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public Teacher setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
        return this;
    }

    public float getFlightCost() {
        return flightCost;
    }

    public Teacher setFlightCost(float flightCost) {
        this.flightCost = flightCost;
        return this;
    }

    public float getAirportVat() {
        return airportVat;
    }

    public Teacher setAirportVat(float airportVat) {
        this.airportVat = airportVat;
        return this;
    }

    public int getAbodeNight() {
        return abodeNight;
    }

    public Teacher setAbodeNight(int abodeNight) {
        this.abodeNight = abodeNight;
        return this;
    }

    public float getAbodePerNight() {
        return abodePerNight;
    }

    public Teacher setAbodePerNight(float abodePerNight) {
        this.abodePerNight = abodePerNight;
        return this;
    }

    public int getAllowanceDay() {
        return allowanceDay;
    }

    public Teacher setAllowanceDay(int allowanceDay) {
        this.allowanceDay = allowanceDay;
        return this;
    }

    public float getAllowancePerDay() {
        return allowancePerDay;
    }

    public Teacher setAllowancePerDay(float allowancePerDay) {
        this.allowancePerDay = allowancePerDay;
        return this;
    }

    public float getCostOfTravelInForeign() {
        return costOfTravelInForeign;
    }

    public Teacher setCostOfTravelInForeign(float costOfTravelInForeign) {
        this.costOfTravelInForeign = costOfTravelInForeign;
        return this;
    }

    public float getCostOfTravelInDomestic() {
        return costOfTravelInDomestic;
    }

    public Teacher setCostOfTravelInDomestic(float costOfTravelInDomestic) {
        this.costOfTravelInDomestic = costOfTravelInDomestic;
        return this;
    }

    public float getSumAllCost() {
        return sumAllCost;
    }

    public Teacher setSumAllCost(float sumAllCost) {
        this.sumAllCost = sumAllCost;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Teacher setDate(Date date) {
        this.date = date;
        return this;
    }
}
