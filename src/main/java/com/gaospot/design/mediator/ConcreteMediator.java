package com.gaospot.design.mediator;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-09 14:40
 */

public class ConcreteMediator extends Mediator {
    Alarm alarm;
    Calender calender;
    CoffeePot coffeePot;
    Sprinkler sprinkler;


    public ConcreteMediator(Alarm alarm, Calender calender, CoffeePot coffeePot, Sprinkler sprinkler) {
        this.alarm = alarm;
        this.calender = calender;
        this.coffeePot = coffeePot;
        this.sprinkler = sprinkler;
    }

    @Override
    void doEvent(String eventType) {
        switch (eventType) {
            case "alarm":
                doAlarmEvent();
                break;
            case "calender":
                doCalenderEvent();
                break;
            default:

        }
    }

    void doAlarmEvent() {
        alarm.doAlarm();
        calender.doCalender();
        coffeePot.doCoffeePot();
        sprinkler.doSprinkler();
    }

    void doCalenderEvent() {

    }
}
