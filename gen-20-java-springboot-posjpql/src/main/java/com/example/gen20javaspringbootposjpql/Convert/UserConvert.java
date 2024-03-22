package com.example.gen20javaspringbootposjpql.Convert;

import com.example.gen20javaspringbootposjpql.Dto.UserDto;
import com.example.gen20javaspringbootposjpql.Entity.Users;

public class UserConvert {
    public static UserDto entityToDto (Users users){
        return new UserDto(
                users.getId(),
                users.getUserName(),
                users.getAddress(),
                users.getGender()
                );
    }

}

