package com.example.gen20javaspringbootposjpql.Service;

import com.example.gen20javaspringbootposjpql.Convert.UserConvert;
import com.example.gen20javaspringbootposjpql.Dto.UserDto;
import com.example.gen20javaspringbootposjpql.Entity.UserEntity;
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
        List<UserEntity> user = userRepository.findAllUserNative();
        return user.stream().map((userEntity) -> UserConvert.entityToDto(userEntity)).collect(Collectors.toList());
    }

    public List<UserDto> findUserByUserName (String userName){
        List<UserEntity> user = userRepository.findUsersByUserNameNative(userName);
        return user.stream().map((userEntity) -> UserConvert.entityToDto(userEntity)).collect(Collectors.toList());
    }
}
