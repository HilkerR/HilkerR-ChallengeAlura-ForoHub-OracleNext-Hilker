package com.challenge_foro_hub.mappers.comment;

import com.challenge_foro_hub.dtos.comment.CommentResponseDto;
import com.challenge_foro_hub.models.entitites.Comment;

public class CommentResponseMapper {

    public static CommentResponseDto toDto(Comment comment) {
        return new CommentResponseDto(comment.getId(),comment.getMessage(),comment.getStatus(),comment.getUser().getUserName());
    }
}
