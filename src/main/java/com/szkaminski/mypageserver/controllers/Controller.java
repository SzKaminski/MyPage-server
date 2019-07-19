package com.szkaminski.mypageserver.controllers;

import com.szkaminski.mypageserver.model.Comment;
import com.szkaminski.mypageserver.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
public class Controller {

    private final CommentService commentService;

    @Autowired
    public Controller(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/getComment")
    public Comment getComment(){
        return new Comment("Adam", LocalDateTime.of(2018,2,22,3,42), "Good job");
    }

    @GetMapping("/getListOfComments")
    public ArrayList<Comment> getList(){
        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(new Comment("Adam", LocalDateTime.of(2018,2,22,3,42), "Good job"));
        comments.add(new Comment("Sławek", LocalDateTime.of(2018,3,11,13,22), "Best regards from work"));

        return comments;
    }

    @PostMapping("/postComment")
    public Long postComment(@RequestBody Comment comment){
        return commentService.postComment(comment).getId();

    }
}
