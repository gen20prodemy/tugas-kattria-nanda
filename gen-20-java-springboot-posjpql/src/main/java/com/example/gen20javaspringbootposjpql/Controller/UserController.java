package com.example.gen20javaspringbootposjpql.Controller;

import com.example.gen20javaspringbootposjpql.Dto.UserDto;
import com.example.gen20javaspringbootposjpql.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity <List<UserDto>> getAllUser (){
        List<UserDto> user = userService.getAllUser();
        return ResponseEntity.ok(user);
    }


    @GetMapping("/get")
    public ResponseEntity <List<UserDto>> getUserByUserName (@RequestParam String userName) {
        List<UserDto> user = userService.findUserByUserName(userName);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/getjpql")
    public ResponseEntity <List<UserDto>> getAllUserJpql (){
        List<UserDto> user = userService.getAllUserJpql();
        return ResponseEntity.ok(user);
    }

}
