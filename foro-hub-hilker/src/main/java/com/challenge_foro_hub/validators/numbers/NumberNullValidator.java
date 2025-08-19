package com.challenge_foro_hub.validators.numbers;

import com.challenge_foro_hub.exceptions.validators.NumberValidationException;
import com.challenge_foro_hub.exceptions.validators.ValidationException;
import com.challenge_foro_hub.validators.Validator;

public class NumberNullValidator implements Validator<Integer> {

    @Override
    public void validate(Integer value) throws ValidationException {
        if (value == null) {
            throw new NumberValidationException("El campo no puede ser nulo");
        }
    }
}
