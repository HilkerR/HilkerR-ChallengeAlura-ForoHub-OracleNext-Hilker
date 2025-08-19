package com.challenge_foro_hub.mappers.topic;

import com.challenge_foro_hub.dtos.topic.TopicResponseDto;
import com.challenge_foro_hub.mappers.comment.CommentResponseMapper;
import com.challenge_foro_hub.models.entitites.Topic;

public class TopicResponseMapper {
    public static TopicResponseDto toDto(Topic topic) {
        return new TopicResponseDto(topic.getId(),
                topic.getTitle(),
                topic.getMessage(),
                topic.getStatus(),
                topic.getCreationDate(),
                topic.getLastUpdateDate(),
                topic.getUser().getId(),
                topic.getUser().getUserName(),
                topic.getUser().getEmail(),
                topic.getComments().stream().map(CommentResponseMapper::toDto).toList());
    }

}
