package com.example.gen20javaspringbootposjpql.Dto;

public class UserDto {

    private Long id;
    private String userName;
    private String address;
    private String gender;

    public UserDto() {
    }

    public UserDto(Long id, String userName, String address, String gender) {
        this.id = id;
        this.userName = userName;
        this.address = address;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
