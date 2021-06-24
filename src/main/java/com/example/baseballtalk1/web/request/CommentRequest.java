package com.example.baseballtalk1.web.request;

import com.example.baseballtalk1.persistence.entity.Comment;
import com.fasterxml.jackson.annotation.JsonCreator;

public class CommentRequest {
    private String name;
    private String message;
    private Integer teamId;
    private Integer likePoint;
    private Integer userId;

    @JsonCreator
    public CommentRequest(String name, String message, Integer teamId, Integer likePoint, Integer userId) {
        this.name = name;
        this.message = message;
        this.teamId = teamId;
        this.likePoint = likePoint;
        this.userId = userId;
    }

    public Comment convertToEntity() {
        return new Comment(name, message, teamId, likePoint, userId);
    }
}
