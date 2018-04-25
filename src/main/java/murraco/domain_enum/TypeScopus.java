package murraco.domain_enum;

import org.springframework.security.core.GrantedAuthority;

public enum TypeScopus implements GrantedAuthority {
    FULL, SUMMARIZE;

    public String getAuthority() {
        return name();
    }
}
