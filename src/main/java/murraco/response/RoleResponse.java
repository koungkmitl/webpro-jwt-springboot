package murraco.response;

import murraco.domain_enum.Role;
import java.util.List;
public class RoleResponse {

    private List<Role> roles;

    public RoleResponse(List<Role> roles) {
        this.roles = roles;
    }

    public RoleResponse() {
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
