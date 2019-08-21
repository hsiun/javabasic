package com.gaospot.design.facade;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-15 09:59
 */

public class Facade {

    private SubSystem subSystem = new SubSystem();

    public void watchTV() {
        subSystem.turnOnTV();
        subSystem.setCD();
        subSystem.watchTV();
    }
}
