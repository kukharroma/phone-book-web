package com.cooksdev.service.exception;

public enum ErrorReason {

    //Service errors
    INTERNAL_SERVER_ERROR("Internal Server Error"),
    JSON_MARSHALLING_ERROR("Unable to marshal object %s"),

    //Validation errors
    VALIDATION_PARAMETER_IS_NULL("Parameter is null"),
    NOT_VALID_LOGIN("Login is not valid"),
    PASSWORD_LENGTH_IS_LESS_THAN_5("Password length is less than 5"),
    FULL_NAME_LENGTH_IS_LESS_THAN_5("Full name length is less than 5"),
    NAME_IS_LESS_THAN_4("Name length is less than 4"),
    SURNAME_IS_LESS_THAN_4("Surname length is less than 4"),
    NOT_VALID_MOBILE_PHONE("Mobile phone is not valid"),
    NOT_VALID_EMAIL("Email is not valid"),

    ACCOUNT_ALREADY_EXISTS("Account with this login already exists");

    private String description;

    ErrorReason(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
