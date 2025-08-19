package com.challenge_foro_hub.validators.strings;

import com.challenge_foro_hub.exceptions.validators.StringValidationException;
import com.challenge_foro_hub.exceptions.validators.ValidationException;
import com.challenge_foro_hub.validators.Validator;

public class StringEmptyValidator implements Validator<String> {
    @Override
    public void validate(String value) throws ValidationException {
        if (value.isEmpty()) {
            throw new StringValidationException("El campo no puede estar vacio");
        }
    }
}
