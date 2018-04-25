package murraco.domain_enum;

import org.springframework.security.core.GrantedAuthority;

public enum TypeDoc implements GrantedAuthority {
    TEACHER, STUDENT;

    //table conference | coloumn typedoc
    public String getAuthority() {
        return name();
    }
}
