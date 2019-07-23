package com.szkaminski.mypageserver.repositories;

import com.szkaminski.mypageserver.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    Comment save(Comment comment);
}
