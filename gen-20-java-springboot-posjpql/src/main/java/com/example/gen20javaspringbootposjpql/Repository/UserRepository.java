package com.example.gen20javaspringbootposjpql.Repository;

import com.example.gen20javaspringbootposjpql.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository <Users, Long> {

    @Query (value = "SELECT * FROM user_data", nativeQuery = true)
    List<Users> findAllUserNative();

    @Query(value = "SELECT * FROM user_data WHERE user_name= :'userName'", nativeQuery = true)
    List<Users> findUsersByUserNameNative (String userName);

    //jpql
    @Query("SELECT e FROM Users e" )
    List <Users> findAllUserJpql ();

}
