package murraco.response;

import org.springframework.http.HttpStatus;

public class CustomResponse {

    private int status;
    private String message;
    private HttpStatus httpStatus;

    public CustomResponse(String message, HttpStatus httpStatus, int status) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public int getStatus() {
        return status;
    }
}
