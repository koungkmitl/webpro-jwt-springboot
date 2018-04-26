package murraco.domain;

import murraco.domain_enum.TypeScopus;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "scopus")
public class Scopus extends QualityConference {
    @Enumerated(EnumType.STRING)
    private TypeScopus typeScopus;

    public TypeScopus getTypeScopus() {
        return typeScopus;
    }

    public Scopus setTypeScopus(TypeScopus typeScopus) {
        this.typeScopus = typeScopus;
        return this;
    }
}
