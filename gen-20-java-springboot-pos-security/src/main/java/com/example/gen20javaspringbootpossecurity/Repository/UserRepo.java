package com.example.gen20javaspringbootpossecurity.Repository;

import com.example.gen20javaspringbootpossecurity.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository <UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}
