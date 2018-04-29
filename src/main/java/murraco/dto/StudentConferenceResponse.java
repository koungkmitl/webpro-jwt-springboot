package murraco.dto;

import murraco.domain.Student;

import java.util.List;

public class StudentConferenceResponse {
    private List<Student> conferenceList;
    private int amount;

    public StudentConferenceResponse(List<Student> conferenceList, int amount) {
        this.conferenceList = conferenceList;
        this.amount = amount;
    }

    public StudentConferenceResponse() {

    }

    public List<Student> getConferenceList() {

        return conferenceList;
    }

    public void setConferenceList(List<Student> conferenceList) {
        this.conferenceList = conferenceList;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
