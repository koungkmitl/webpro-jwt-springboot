package murraco.domain_enum;

import org.springframework.security.core.GrantedAuthority;

public enum TypeConference implements GrantedAuthority {
    CIF, SJR, SCOPUS, CCE;

    //table quality_conference | column conference_type
    public String getAuthority() {
        return name();
    }
}
