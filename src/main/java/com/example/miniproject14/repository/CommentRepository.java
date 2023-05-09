package com.example.miniproject14.repository;

import com.example.miniproject14.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    //List<Comment> findAllByOrderByModifiedAtDesc();
}
