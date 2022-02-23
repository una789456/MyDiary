package com.mydiary.diary.repository;

import com.mydiary.diary.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
