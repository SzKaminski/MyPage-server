package com.szkaminski.mypageserver.services;

import com.szkaminski.mypageserver.model.Comment;
import com.szkaminski.mypageserver.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getComments(){
        return commentRepository.findAll();
    }

    public Comment postComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(Long id) {
        commentRepository.delete(commentRepository.getOne(id));
    }
}
