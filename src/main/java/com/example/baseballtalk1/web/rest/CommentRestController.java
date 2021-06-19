package com.example.baseballtalk1.web.rest;

import com.example.baseballtalk1.persistence.entity.Comment;
import com.example.baseballtalk1.service.CommentService;
import com.example.baseballtalk1.web.response.CommentResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentRestController {

    private final CommentService commentService;

    public CommentRestController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/{teamId}")
    public List<CommentResponse> findByTeamId (@PathVariable Integer teamId) {
        List<Comment> commentList = commentService.findByTeamId(teamId);
        List<CommentResponse> commentResponseList = new ArrayList<>();
        for (Comment comment : commentList) {
            CommentResponse commentResponse = new CommentResponse(comment);
            commentResponseList.add(commentResponse);
        }
        return commentResponseList;
    }
}
