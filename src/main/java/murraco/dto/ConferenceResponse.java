package murraco.dto;

import murraco.domain.Conference;

import java.util.List;

public class ConferenceResponse {
    private List<Conference> conferenceList;
    private int amount;

    public ConferenceResponse(List<Conference> conferenceList, int amount) {
        this.conferenceList = conferenceList;
        this.amount = amount;
    }

    public ConferenceResponse() {
    }

    public List<Conference> getConferenceList() {
        return conferenceList;
    }

    public ConferenceResponse setConferenceList(List<Conference> conferenceList) {
        this.conferenceList = conferenceList;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public ConferenceResponse setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
