package murraco.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "ccr")
public class Ccr extends QualityConference {
    private Integer rank;

    public Integer getRank() {
        return rank;
    }

    public Ccr setRank(Integer rank) {
        this.rank = rank;
        return this;
    }
}
