package murraco.dto;

import murraco.domain.Teacher;

import java.util.List;

public class TeacherConferenceResponse {
    private List<Teacher> conferenceList;
    private int amount;

    public List<Teacher> getConferenceList() {
        return conferenceList;
    }

    public void setConferenceList(List<Teacher> conferenceList) {
        this.conferenceList = conferenceList;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public TeacherConferenceResponse(List<Teacher> conferenceList, int amount) {

        this.conferenceList = conferenceList;
        this.amount = amount;
    }

    public TeacherConferenceResponse() {

    }
}
