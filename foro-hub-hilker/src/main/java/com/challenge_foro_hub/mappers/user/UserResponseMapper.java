package com.challenge_foro_hub.mappers.user;

import com.challenge_foro_hub.dtos.user.UserResponseDto;
import com.challenge_foro_hub.models.entitites.User;

public class UserResponseMapper {

    public static UserResponseDto toDto(User user) {
        return new UserResponseDto(user.getId(), user.getUserName(), user.getEmail());
    }


}
