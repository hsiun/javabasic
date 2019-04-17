package com.gaospot.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by gao on 2018/10/24.
 */
public class Test {
    public static void main(String[] args) {
        try {
            Class word = Class.forName("com.gaospot.reflect.Word");

            //在没有实例前获取变量和方法
            Field f = word.getField("name");
            Method method = word.getMethod("print");

            //创建Word实例
            Word word1 = (Word)word.newInstance();
            f.set(word1,"高雄");

            word1.print();

            method.invoke(word1);

        } catch (Exception e) {
            e.printStackTrace();
        }





    }
}
