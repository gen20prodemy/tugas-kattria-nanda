package com.example.gen20javaspringbootposjpql.Service;

import com.example.gen20javaspringbootposjpql.Convert.UserConvert;
import com.example.gen20javaspringbootposjpql.Dto.UserDto;
import com.example.gen20javaspringbootposjpql.Entity.Users;
import com.example.gen20javaspringbootposjpql.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getAllUser (){
        List<Users> user = userRepository.findAllUserNative();
        return user.stream().map((users) -> UserConvert.entityToDto(users)).collect(Collectors.toList());
    }

    public List<UserDto> findUserByUserName (String userName){
        List<Users> user = userRepository.findUsersByUserNameNative(userName);
        return user.stream().map((users) -> UserConvert.entityToDto(users)).collect(Collectors.toList());
    }

    public List<UserDto> getAllUserJpql (){
        List<Users> user = userRepository.findAllUserJpql();
        return user.stream().map((users) -> UserConvert.entityToDto(users)).collect(Collectors.toList());
    }

}
