package murraco.dto;

import java.util.Date;

public class CommentDto {
    private String check;
    private String textComment;
    private Date date;
    private int conferenceId;

    public CommentDto() {
    }

    public CommentDto(String check, String textComment, Date date, int conferenceId) {
        this.check = check;
        this.textComment = textComment;
        this.date = date;
        this.conferenceId = conferenceId;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(int conferenceId) {
        this.conferenceId = conferenceId;
    }
}
