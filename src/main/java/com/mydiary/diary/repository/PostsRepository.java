package com.mydiary.diary.repository;

import com.mydiary.diary.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
