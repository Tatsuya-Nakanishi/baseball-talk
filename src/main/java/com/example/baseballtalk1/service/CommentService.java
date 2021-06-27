package com.example.baseballtalk1.service;

import com.example.baseballtalk1.persistence.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findByTeamId(Integer teamId);
    void commentInsert(Comment comment);
    void updateLikePoint(Comment comment);


}
