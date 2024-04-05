package com.example.gen20javaspringbootposasync.Repository;

import com.example.gen20javaspringbootposasync.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository <UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}
