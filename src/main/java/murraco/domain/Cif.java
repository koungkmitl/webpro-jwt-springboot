package murraco.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "cif")
public class Cif extends QualityConference {
    private int hIndex;
    private int citationTotal;
    private int group;

    public int gethIndex() {
        return hIndex;
    }

    public Cif sethIndex(int hIndex) {
        this.hIndex = hIndex;
        return this;
    }

    public int getCitationTotal() {
        return citationTotal;
    }

    public Cif setCitationTotal(int citationTotal) {
        this.citationTotal = citationTotal;
        return this;
    }

    public int getGroup() {
        return group;
    }

    public Cif setGroup(int group) {
        this.group = group;
        return this;
    }
}
