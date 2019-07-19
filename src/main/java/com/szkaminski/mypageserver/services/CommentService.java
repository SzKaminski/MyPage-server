package com.szkaminski.mypageserver.services;

import com.szkaminski.mypageserver.model.Comment;
import com.szkaminski.mypageserver.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment postComment(Comment comment) {
        return commentRepository.save(comment);
    }
}
