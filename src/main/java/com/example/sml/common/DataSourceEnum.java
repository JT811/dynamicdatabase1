package com.example.sml.common;

public enum DataSourceEnum {
    MySql("My"),Sqlite("lite");
    
    private final String name;
    
    private DataSourceEnum(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}