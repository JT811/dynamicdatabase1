package com.example.sml.service.Impl;

import com.example.sml.annotation.DB;
import com.example.sml.entity.User;
import com.example.sml.mapper.UserMapper;
import com.example.sml.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    @DB("lite")
    public int totalCount() {
        return userMapper.totalCount();
    }

    @Override
    @DB("lite")
    public List<User> allUsers() {
        return userMapper.allUsers();
    }
}
