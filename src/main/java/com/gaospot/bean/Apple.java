package com.gaospot.bean;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/3/19 2:43 PM
 * @description: //TODO
 */

public class Apple {

    private String color;

    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if ("a".equals(this.name)) {
            this.color = "red";
        } else {
            this.color = color;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
