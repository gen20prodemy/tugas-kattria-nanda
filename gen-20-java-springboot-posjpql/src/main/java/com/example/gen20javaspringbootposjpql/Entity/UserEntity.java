package com.example.gen20javaspringbootposjpql.Entity;

import jakarta.persistence.*;

@Entity
@Table(name= "user_data")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userName;
    @Column
    private String address;
    @Column
    private String gender;

    public UserEntity() {
    }

    public UserEntity(Long id, String userName, String address, String gender) {
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
