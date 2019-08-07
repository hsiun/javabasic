package com.gaospot.design.command;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 10:10
 */

public class Client {
    public static void main(String[] args) {
        Light light = new Light();

        Command offCommand = new LightOffCommand(light);
        Command onCommand = new LightOnCommand(light);

        Invoker invoker = new Invoker();
        invoker.setOffCOmmand(offCommand, 0);
        invoker.setOnCommand(onCommand, 0);
        invoker.offButtonPush(0);
        invoker.onButtonPush(0);
    }
}
