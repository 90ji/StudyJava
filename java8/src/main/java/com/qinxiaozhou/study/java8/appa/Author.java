package com.qinxiaozhou.study.java8.appa;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(com.qinxiaozhou.study.java8.appa.Authors.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {

    String name();

}
