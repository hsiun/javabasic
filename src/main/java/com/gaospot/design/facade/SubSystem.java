package com.gaospot.design.facade;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-15 09:57
 */

public class SubSystem {
    //这种模式可以说非常的简单了
    //就是把一堆的操作封装起来，实现一下操作全部的功能

    //开电视
    public void turnOnTV() {
        System.out.println("TV on");
    }

    //设置CD
    public void setCD() {
        System.out.println("Set CD");
    }

    //看电视
    public void watchTV() {
        System.out.println("watch TV");
    }
}
