package com.cooksdev.service.exception;

public enum ErrorReason {

    //Service errors
    INTERNAL_SERVER_ERROR("Internal Server Error"),
    ENTITY_WAS_NOT_FOUND("%s was not found"),
    ENTITY_WAS_NOT_ADDED("%s was not added"),
    ENTITY_WAS_NOT_UPDATED("%s was not updated"),
    ENTITY_WAS_NOT_DELETED("%s was not deleted"),

    //Validation errors
    NOT_VALID_ID("Id is not valid"),
    NOT_VALID_LOGIN("Login is not valid"),
    PASSWORD_LENGTH_IS_LESS_THAN_5("Password length is less than 5"),
    FULL_NAME_LENGTH_IS_LESS_THAN_5("Full name length is less than 5"),
    NAME_IS_LESS_THAN_4("Name length is less than 4"),
    SURNAME_IS_LESS_THAN_4("Surname length is less than 4"),
    NOT_VALID_MOBILE_PHONE("Mobile phone is not valid"),
    NOT_VALID_MAIL("EMail is not valid");

    private String description;

    ErrorReason(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
