package com.mydiary.diary.repository;

import com.mydiary.diary.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Post, Long> {
}
