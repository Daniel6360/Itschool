package ro.itschool.shopApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse {
    private final String message;

    public String getMessage() {
        return message;
    }

    public ErrorResponse(@JsonProperty String message) {
        this.message = message;
    }

}
