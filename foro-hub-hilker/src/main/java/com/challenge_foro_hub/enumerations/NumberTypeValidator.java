package com.challenge_foro_hub.enumerations;

import com.challenge_foro_hub.validators.Validator;
import com.challenge_foro_hub.validators.numbers.NumberNegativeValidator;
import com.challenge_foro_hub.validators.numbers.NumberNullValidator;


public enum NumberTypeValidator {
    NULL(new NumberNullValidator()),
    NEGATIVE(new NumberNegativeValidator());


    private final Validator<Integer> validator;

    NumberTypeValidator(Validator<Integer> validator) {
        this.validator = validator;
    }

    public void validate(Integer value) {
        this.validator.validate(value);
    }
}
