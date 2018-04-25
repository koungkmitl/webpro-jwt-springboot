package murraco.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "ccr")
public class Ccr extends QualityConference {
    private int rank;
    private int group;
}
