package murraco.domain_enum;

import org.springframework.security.core.GrantedAuthority;

public enum TypePublic implements GrantedAuthority {
    IN_SCOPUS, IN_LIST;

    public String getAuthority() {
        return name();
    }
}
