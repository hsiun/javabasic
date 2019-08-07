package com.gaospot.practice;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 09:31
 */

public class Person {

    private String name;


    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
