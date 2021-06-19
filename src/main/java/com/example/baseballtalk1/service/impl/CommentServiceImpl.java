package com.example.baseballtalk1.service.impl;

import com.example.baseballtalk1.persistence.mapper.CommentMapper;
import com.example.baseballtalk1.persistence.entity.Comment;
import com.example.baseballtalk1.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    private final CommentMapper commentMapper;

    public CommentServiceImpl(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Comment> findByTeamId(Integer teamId) {
        List<Comment> commentList = commentMapper.findByTeamId(teamId);
        return commentList;
    }
}
