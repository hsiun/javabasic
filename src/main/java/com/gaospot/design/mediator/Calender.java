package com.gaospot.design.mediator;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-09 14:34
 */

public class Calender extends Colleague {

    @Override
    void onEvent(Mediator mediator) {
        mediator.doEvent("calender");
    }


    void doCalender() {
        System.out.println("doCalender");
    }
}
