package com.example.sml.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.METHOD,ElementType.TYPE})
// 保留方式
@Retention(RetentionPolicy.RUNTIME)
public @interface DB {
    String value() default "My";
}
