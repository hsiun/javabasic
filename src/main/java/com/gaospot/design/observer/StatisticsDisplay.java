package com.gaospot.design.observer;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-07 09:56
 */

public class StatisticsDisplay implements Observer {

    public StatisticsDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay" + temp + humidity + pressure);
    }
}
