package com.gaospot.design.mediator;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-09 14:34
 */

public class Sprinkler extends Colleague {

    @Override
    void onEvent(Mediator mediator) {
        mediator.doEvent("sprinkler");
    }

    void doSprinkler() {
        System.out.println("doSprinkler");
    }
}
