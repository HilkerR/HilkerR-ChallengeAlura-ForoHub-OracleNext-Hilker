package com.challenge_foro_hub.validators.strings;

import com.challenge_foro_hub.exceptions.validators.StringValidationException;
import com.challenge_foro_hub.exceptions.validators.ValidationException;
import com.challenge_foro_hub.validators.Validator;

public class StringNullValidator implements Validator<String> {
    @Override
    public void validate(String s) throws ValidationException {
        if (s == null) {
            throw new StringValidationException("El campo no puede ser nulo");
        }
    }
}
