package com.example.gen20javaspringbootposjpql.Repository;

import com.example.gen20javaspringbootposjpql.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long> {

    @Query (value = "SELECT * FROM user_data", nativeQuery = true)
    List<UserEntity> findAllUserNative();

    @Query(value = "SELECT * FROM user_data WHERE user_name= :userName", nativeQuery = true)
    List<UserEntity> findUsersByUserNameNative (String userName);
}
