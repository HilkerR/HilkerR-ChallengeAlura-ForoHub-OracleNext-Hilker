package com.challenge_foro_hub.exceptions.validators;

import com.challenge_foro_hub.exceptions.validators.ValidationException;

public class StringValidationException extends ValidationException {
    public StringValidationException(String message) {
        super(message);
    }
}
