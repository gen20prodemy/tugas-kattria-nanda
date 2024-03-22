package com.example.gen20javaspringbootposjpql.Convert;

import com.example.gen20javaspringbootposjpql.Dto.UserDto;
import com.example.gen20javaspringbootposjpql.Entity.UserEntity;

public class UserConvert {
    public static UserDto entityToDto (UserEntity userEntity){
        return new UserDto(
                userEntity.getId(),
                userEntity.getUserName(),
                userEntity.getAddress(),
                userEntity.getGender()
                );
    }

}

