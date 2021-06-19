package com.example.baseballtalk1.web.response;

import com.example.baseballtalk1.persistence.entity.Comment;


public class CommentResponse {
    private Integer id;
    private String name;
    private String message;
    private Integer teamId;
    private Integer likePoint;
    private Integer userId;

    public CommentResponse(Comment comment) {
        this.id = comment.getId();
        this.name = comment.getName();
        this.message = comment.getMessage();
        this.teamId = comment.getTeamId();
        this.likePoint = comment.getLikePoint();
        this.userId = comment.getUserId();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public Integer getLikePoint() {
        return likePoint;
    }

    public Integer getUserId() {
        return userId;
    }
}
