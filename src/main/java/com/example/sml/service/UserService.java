package com.example.sml.service;

import com.example.sml.entity.User;

import java.util.List;

public interface UserService {
    int totalCount();
    List<User> allUsers();
}
