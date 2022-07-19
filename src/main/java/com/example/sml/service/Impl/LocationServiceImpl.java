package com.example.sml.service.Impl;

import com.example.sml.annotation.DB;
import com.example.sml.entity.Location;
import com.example.sml.entity.User;
import com.example.sml.mapper.LocationMapper;
import com.example.sml.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationMapper locationMapper;

    @Override
    @DB("lite2")
    public List<Location> findAll() {
        return locationMapper.findAll();
    }
}

