package com.gaospot.design.command;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 10:03
 */

public class LightOffCommand implements Command {

    private Light light;


    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.off();
    }
}
