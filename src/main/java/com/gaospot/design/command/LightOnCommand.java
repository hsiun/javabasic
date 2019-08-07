package com.gaospot.design.command;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 10:02
 */

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.on();
    }
}
