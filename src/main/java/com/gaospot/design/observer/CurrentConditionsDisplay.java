package com.gaospot.design.observer;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-07 09:57
 */

public class CurrentConditionsDisplay implements Observer{


    public CurrentConditionsDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionsDisplay" + temp + humidity + pressure);
    }
}
