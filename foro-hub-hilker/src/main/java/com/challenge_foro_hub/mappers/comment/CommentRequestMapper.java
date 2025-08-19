package com.challenge_foro_hub.mappers.comment;

import com.challenge_foro_hub.dtos.comment.CommentRequestDto;
import com.challenge_foro_hub.models.entitites.Comment;
import com.challenge_foro_hub.models.entitites.Topic;
import com.challenge_foro_hub.models.entitites.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class CommentRequestMapper {
    public static Comment toEntity(CommentRequestDto dto) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(user.getUserName());
        Topic topic = new Topic();
        topic.setId(dto.topicId());
        return new Comment(dto.message(),topic, user);
    }

}