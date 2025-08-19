package com.challenge_foro_hub.validators;

import com.challenge_foro_hub.enumerations.NumberTypeValidator;
import com.challenge_foro_hub.validators.numbers.NumberValidator;
import com.challenge_foro_hub.validators.numbers.NumberValidatorBuilder;
import com.challenge_foro_hub.enumerations.StringTypeValidator;
import com.challenge_foro_hub.validators.strings.StringValidator;
import com.challenge_foro_hub.validators.strings.StringValidatorBuilder;

public class UserValidator {

    public static void validateUserName(String name) {
        StringValidator validator = StringValidatorBuilder.create()
                                            .add(StringTypeValidator.TOO_LONG_30)
                                            .add(StringTypeValidator.NULL)
                                            .add(StringTypeValidator.EMPTY)
                                            .build();
        validator.validate(name);
    }

    public static void validatePassword(String password) {
        StringValidator validator = StringValidatorBuilder.create()
                                            .add(StringTypeValidator.TOO_LONG_100)
                                            .add(StringTypeValidator.NULL)
                                            .add(StringTypeValidator.EMPTY)
                                            .build();
        validator.validate(password);
    }

    public static void validateEmail(String email) {
        StringValidator validator = StringValidatorBuilder.create()
                                            .add(StringTypeValidator.TOO_LONG_50)
                                            .add(StringTypeValidator.NULL)
                                            .add(StringTypeValidator.EMPTY)
                                            .build();
        validator.validate(email);
    }

    public static void validateId(Long id) {
        if (id == null) {
            return;
        }
        NumberValidator validator = NumberValidatorBuilder.create()
                                            .add(NumberTypeValidator.NEGATIVE)
                                            .build();
        validator.validate(Math.toIntExact(id));
    }
}
