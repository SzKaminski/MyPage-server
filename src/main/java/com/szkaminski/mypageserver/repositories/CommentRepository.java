package com.szkaminski.mypageserver.repositories;

import com.szkaminski.mypageserver.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {

    Comment save(Comment comment);
}
