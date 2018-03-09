package com.qinxiaozhou.study.java8.appa;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Authors {

    com.qinxiaozhou.study.java8.appa.Author[] value();

}
