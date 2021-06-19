package com.example.baseballtalk1.persistence.entity;

public class Comment {
    private Integer id;
    private String name;
    private String message;
    private Integer teamId;
    private Integer likePoint;
    private Integer userId;

    public Comment() {}

    public Comment(String name, String message, Integer teamId, Integer likePoint, Integer userId) {
        this.name = name;
        this.message = message;
        this.teamId = teamId;
        this.likePoint = likePoint;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getLikePoint() {
        return likePoint;
    }

    public void setLikePoint(Integer likePoint) {
        this.likePoint = likePoint;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

