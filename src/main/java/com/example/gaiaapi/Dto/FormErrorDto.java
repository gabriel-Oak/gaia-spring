package com.example.gaiaapi.Dto;

public class FormErrorDto {
    private String message;
    private String field;

    public FormErrorDto(String message, String field) {
        this.message = message;
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public String getField() {
        return field;
    }
}
