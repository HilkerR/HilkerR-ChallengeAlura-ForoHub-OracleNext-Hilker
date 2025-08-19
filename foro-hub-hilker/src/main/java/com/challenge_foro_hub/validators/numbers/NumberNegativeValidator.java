package com.challenge_foro_hub.validators.numbers;

import com.challenge_foro_hub.exceptions.validators.NumberValidationException;
import com.challenge_foro_hub.exceptions.validators.ValidationException;
import com.challenge_foro_hub.validators.Validator;

public class NumberNegativeValidator implements Validator<Integer> {

    @Override
    public void validate(Integer number) throws ValidationException {
        if (number < 0) {
            throw new NumberValidationException("El campo no puede ser negativo");
        }
    }
}
