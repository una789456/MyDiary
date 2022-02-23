package com.mydiary.diary.repository;

import com.mydiary.diary.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {

}
