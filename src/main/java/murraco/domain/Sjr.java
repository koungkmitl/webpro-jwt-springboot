package murraco.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "sjr")
public class Sjr extends QualityConference {
    private int group;
    private int hIndexYear;
    private int hIndex;
    private int sjrYear;
    private float sjrScore;
}
