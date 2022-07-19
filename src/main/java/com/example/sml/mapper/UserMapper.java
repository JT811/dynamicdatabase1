package com.example.sml.mapper;

import com.example.sml.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int totalCount();
   List<User> allUsers();
}
