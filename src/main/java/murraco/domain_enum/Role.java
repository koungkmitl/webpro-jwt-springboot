package murraco.domain_enum;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_ADMIN, ROLE_CLIENT, ROLE_TEACHER, ROLE_STUDENT,
    ROLE_STAFF_HR, ROLE_STAFF_RESEARCH, ROLE_STAFF_FINANCE, ROLE_STAFF_DORECTOR, ROLE_STAFF_DEAN,
    ROLE_STAFF_REGISTRATION, ROLE_STAFF_ASSOCIATEDEAN;

    public String getAuthority() {
        return name();
    }
}
