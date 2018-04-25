package murraco.domain_enum;

import org.springframework.security.core.GrantedAuthority;

public enum TypeImage implements GrantedAuthority {
    FORM, ACCEPTANCEYPE;

    public String getAuthority() {
        return name();
    }
}
