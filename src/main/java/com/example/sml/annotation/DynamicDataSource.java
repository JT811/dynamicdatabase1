package com.example.sml.annotation;

import com.example.sml.common.DataSourceEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Component
@Primary   // 将该Bean设置为主要注入Bean
public class DynamicDataSource extends AbstractRoutingDataSource {


    // 当前使用的数据源标识
    public static ThreadLocal<String> name=new ThreadLocal<>();

    @Autowired
    DataSource dataSource1;
    @Autowired
    DataSource dataSource2;
    @Autowired
    DataSource dataSource3;

    // 返回当前数据源标识
    @Override
    protected Object determineCurrentLookupKey() {
        return name.get();

    }


    @Override
    public void afterPropertiesSet() {

        // 为targetDataSources初始化所有数据源
        Map<Object, Object> targetDataSources=new HashMap<>();
        targetDataSources.put(DataSourceEnum.MySql.getName(),dataSource1);
        targetDataSources.put(DataSourceEnum.Sqlite.getName(),dataSource2);
        targetDataSources.put("lite2",dataSource3);
        super.setTargetDataSources(targetDataSources);

        // 为defaultTargetDataSource 设置默认的数据源
        super.setDefaultTargetDataSource(dataSource1);

        super.afterPropertiesSet();
    }
}
