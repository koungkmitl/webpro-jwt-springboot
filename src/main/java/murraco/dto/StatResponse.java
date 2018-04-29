package murraco.dto;

public class StatResponse {
    private int amountJournal;
    private float allRequireMoney;
    private int passJournal;


    public StatResponse() {
    }

    public StatResponse(int amountJournal, float allRequireMoney, int passJournal) {

        this.amountJournal = amountJournal;
        this.allRequireMoney = allRequireMoney;
        this.passJournal = passJournal;
    }

    public int getAmountJournal() {
        return amountJournal;
    }

    public void setAmountJournal(int amountJournal) {
        this.amountJournal = amountJournal;
    }

    public float getAllRequireMoney() {
        return allRequireMoney;
    }

    public void setAllRequireMoney(float allRequireMoney) {
        this.allRequireMoney = allRequireMoney;
    }

    public int getPassJournal() {
        return passJournal;
    }

    public void setPassJournal(int passJournal) {
        this.passJournal = passJournal;
    }
}
