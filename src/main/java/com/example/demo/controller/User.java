package com.example.demo.controller;

import lombok.Data;

@Data
public class User {

    private long id;

    private String name;

    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
