package com.qinxiaozhou.study.java8.appa;

import java.util.Arrays;

@com.qinxiaozhou.study.java8.appa.Author(name = "Raoul")
@com.qinxiaozhou.study.java8.appa.Author(name = "Mario")
@com.qinxiaozhou.study.java8.appa.Author(name = "Alan")
public class Book {

    public static void main(String[] args) {
        com.qinxiaozhou.study.java8.appa.Author[] authors = Book.class.getAnnotationsByType(com.qinxiaozhou.study.java8.appa.Author.class);
        Arrays.asList(authors).stream().forEach(a -> {
            System.out.println(a.name());
        });
    }

}
