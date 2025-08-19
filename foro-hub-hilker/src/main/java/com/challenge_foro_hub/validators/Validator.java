package com.challenge_foro_hub.validators;

import com.challenge_foro_hub.exceptions.validators.ValidationException;

public interface Validator <T>{
    void validate(T t) throws ValidationException;
}
