package com.qinxiaozhou.study.java8.test;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;

/**
 * Create by qxz on 2018/3/9
 * Description:
 */
public class Chapter1Test {

    @Test
    public void test01(){
        //old mode
        File[] oldHiddenFiles = new File("").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });
        //new mode
        File[] newHiddenFiles = new File("").listFiles(File::isHidden);
    }
}
