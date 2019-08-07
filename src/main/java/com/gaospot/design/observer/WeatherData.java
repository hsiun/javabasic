package com.gaospot.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-07 09:47
 */

public class WeatherData implements Subject {
    List<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        this.observers = new ArrayList<>();
    }


    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyAllObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        for (int i=0; i<observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }

    }
}
