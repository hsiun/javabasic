package com.gaospot.design.mediator;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-09 14:34
 */

public class CoffeePot extends Colleague {

    @Override
    void onEvent(Mediator mediator) {
        mediator.doEvent("coffeepot");
    }


    void doCoffeePot() {
        System.out.println("doCoffeePot");
    }
}
