package com.example.sml.aspect;

import com.example.sml.annotation.DynamicDataSource;
import com.example.sml.annotation.DB;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class DynamicDataSourceAspect implements Ordered {

    // 前置
    @Before("within(com.example.sml.service.Impl.*) && @annotation(db)")
    public void before(JoinPoint point, DB db){
        String name = db.value();
        DynamicDataSource.name.set(name);

//        System.out.println(name);
    }

    @Override
    public int getOrder() {
        return 0;
    }

    // 环绕通知
}
