package murraco.domain_enum;

import org.springframework.security.core.GrantedAuthority;

public enum TypePublic implements GrantedAuthority {
    DOMESTIC_NATIONAL, DOMESTIC_INTERNATIONAL, ABROAD;

    public String getAuthority() {
        return name();
    }
}
