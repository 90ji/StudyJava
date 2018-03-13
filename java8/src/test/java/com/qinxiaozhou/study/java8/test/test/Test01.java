package com.qinxiaozhou.study.java8.test.test;

import org.junit.Test;

/**
 * Create by qxz on 2018/3/12
 * Description:
 */
public class Test01 {

    @Test
    public void test01() {
        new Thread(() -> {
            System.out.println("aaaaa");
        }).start();

    }
    @Test
    public void test02() {
       final String a ="1111";
        new Thread(() -> {
            System.out.println(a);
        }).start();
    }
}
