package com.szkaminski.mypageserver.controllers;

import com.szkaminski.mypageserver.model.Comment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
public class Controller {

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
}
