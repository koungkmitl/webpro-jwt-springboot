package murraco.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "sjr")
public class Sjr extends QualityConference {
    private Integer hIndexYear;
    private Integer hIndex;
    private Integer sjrYear;
    private Float sjrScore;

    public Integer gethIndexYear() {
        return hIndexYear;
    }

    public Sjr sethIndexYear(Integer hIndexYear) {
        this.hIndexYear = hIndexYear;
        return this;
    }

    public Integer gethIndex() {
        return hIndex;
    }

    public Sjr sethIndex(Integer hIndex) {
        this.hIndex = hIndex;
        return this;
    }

    public Integer getSjrYear() {
        return sjrYear;
    }

    public Sjr setSjrYear(Integer sjrYear) {
        this.sjrYear = sjrYear;
        return this;
    }

    public Float getSjrScore() {
        return sjrScore;
    }

    public Sjr setSjrScore(Float sjrScore) {
        this.sjrScore = sjrScore;
        return this;
    }
}
