package com.example.lobby.repo;

import com.example.lobby.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment , Long> {
}
