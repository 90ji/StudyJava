package com.qinxiaozhou.study.java8.test.test.model;

import com.qinxiaozhou.study.java8.chap4.Dish;

import java.util.Arrays;
import java.util.List;

/**
 * Create by qxz on 2018/3/13
 * Description:
 */
public class A {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(new Dish(" pork", false, 800, Dish.Type.MEAT),
                new Dish(" beef", false, 700, Dish.Type.MEAT),
                new Dish(" chicken", false, 400, Dish.Type.MEAT),
                new Dish(" french fries", true, 530, Dish.Type.OTHER),
                new Dish(" rice", true, 350, Dish.Type.OTHER),
                new Dish(" season fruit", true, 120, Dish.Type.OTHER),
                new Dish(" pizza", true, 550, Dish.Type.OTHER),
                new Dish(" prawns", false, 300, Dish.Type.FISH),
                new Dish(" salmon", false, 450, Dish.Type.FISH));




    }
}
