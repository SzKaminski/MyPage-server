package com.szkaminski.mypageserver.controllers;

import com.szkaminski.mypageserver.model.Comment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Controller {

    @GetMapping("/getComment")
    public Comment getComment(){
        return new Comment("Adam", LocalDateTime.of(2018,2,22,3,42), "Good job");
    }
}
