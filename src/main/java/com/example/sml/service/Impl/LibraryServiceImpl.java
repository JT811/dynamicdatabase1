package com.example.sml.service.Impl;

import com.example.sml.annotation.DB;
import com.example.sml.mapper.LibraryMapper;
import com.example.sml.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements LibraryService {
    @Autowired
    LibraryMapper libraryMapper;

    @Override
//    @DB("My")
    public int totalCount() {
        return libraryMapper.totalCount();
    }
}
