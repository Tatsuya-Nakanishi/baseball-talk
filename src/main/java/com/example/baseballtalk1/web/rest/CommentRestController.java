package com.example.baseballtalk1.web.rest;

import com.example.baseballtalk1.persistence.entity.Comment;
import com.example.baseballtalk1.service.CommentService;
import com.example.baseballtalk1.web.request.CommentRequest;
import com.example.baseballtalk1.web.response.CommentResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    @PostMapping("/{teamId}/post")
    public ResponseEntity<CommentResponse> commentInsert(@PathVariable Integer teamId,
                                                         @RequestBody CommentRequest commentRequest) {
        Comment comment = commentRequest.convertToEntity();

        comment.setTeamId(teamId);

        comment.setLikePoint(0);

        commentService.commentInsert(comment);

        CommentResponse commentResponse = new CommentResponse(comment);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .pathSegment(comment.getId().toString())
                .build().encode().toUri();

        return ResponseEntity.created(location).body(commentResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateLikePoint(@PathVariable Integer id,
                                          @RequestBody CommentRequest commentRequest) {
        Comment comment = commentRequest.convertToEntity();
        comment.setId(id);


        CommentResponse commentResponse = new CommentResponse(comment);
        commentService.updateLikePoint(comment);

        return ResponseEntity.ok().body(commentResponse);
    }
}
