package murraco.dto;

public class TokenResponse {
    private String token;
    private String prefixName;
    private String firstname;
    private String lastname;

    public TokenResponse() {
    }

    public TokenResponse(String token) {
        this.token = token;
    }

    public TokenResponse(String token, String prefixName, String firstname, String lastname) {

        this.token = token;
        this.prefixName = prefixName;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getToken() {

        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPrefixName() {
        return prefixName;
    }

    public void setPrefixName(String prefixName) {
        this.prefixName = prefixName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
