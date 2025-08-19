package com.challenge_foro_hub.mappers.user;

import com.challenge_foro_hub.dtos.user.UserRequestDto;
import com.challenge_foro_hub.models.entitites.User;

public class UserRequestMapper {

    public static User toEntity(UserRequestDto userRequestDto) {
        return new User(null,userRequestDto.userName(), userRequestDto.password(), userRequestDto.email());
    }

}
