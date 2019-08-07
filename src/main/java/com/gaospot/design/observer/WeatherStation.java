package com.gaospot.design.observer;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-07 09:59
 */

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(1.1F, 2.1F, 3.0F);
        weatherData.setMeasurements(2.1F, 3.1F, 4.0F);

    }
}
