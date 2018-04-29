package murraco.domain_enum;

import org.springframework.security.core.GrantedAuthority;

public enum LevelOfConference implements GrantedAuthority{
    DOMESTIC_NATIONAL, DOMESTIC_INTERNATIONAL, ABROAD;

    @Override
    public String getAuthority() {
        return null;
    }
}
