package com.example.sml.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryMapper {
    int totalCount();
}
