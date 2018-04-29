package murraco.dto;

public class ImageDto {
    private int ConferenceId;
    private String TypeImage;

    public ImageDto() {
    }

    public ImageDto(int conferenceId, String typeImage) {

        ConferenceId = conferenceId;
        TypeImage = typeImage;
    }

    public int getConferenceId() {
        return ConferenceId;
    }

    public void setConferenceId(int conferenceId) {
        ConferenceId = conferenceId;
    }

    public String getTypeImage() {
        return TypeImage;
    }

    public void setTypeImage(String typeImage) {
        TypeImage = typeImage;
    }
}
