package murraco.domain_enum;

import org.springframework.security.core.GrantedAuthority;

public enum LevelOfConference implements GrantedAuthority{
    DOMESTIC_NATIONAL, DOMESTIC_INTERNATIONAL, ABROAD, LIMIT_IN_SIX_DOT_TWO;

    @Override
    public String getAuthority() {
        return null;
    }
}
