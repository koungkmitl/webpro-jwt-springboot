package murraco.domain_enum;

import org.springframework.security.core.GrantedAuthority;

public enum State implements GrantedAuthority {
    INIT,
    HR_P, HR_F,
    RESEARCH_P, RESEARCH_F,
    FINANCE_P, FINANCE_F,
    DORETOR_P, DORETOR_F,
    DEAN_P, DEAN_F,
    LETTERACCEPTANCE_P, LETTERACCEPTANCE_F,
    REGISTRATION_P, REGISTRATION_F,
    ASSOCIATEDEAN_P, ASSOCIATEDEAN_F;

    public String getAuthority() {
        return name();
    }
}
