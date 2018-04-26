package murraco.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "cif")
public class Cif extends QualityConference {
    private Integer hIndex;
    private Integer citationTotal;

    public Integer gethIndex() {
        return hIndex;
    }

    public Cif sethIndex(Integer hIndex) {
        this.hIndex = hIndex;
        return this;
    }

    public Integer getCitationTotal() {
        return citationTotal;
    }

    public Cif setCitationTotal(Integer citationTotal) {
        this.citationTotal = citationTotal;
        return this;
    }
}
