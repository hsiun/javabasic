package com.gaospot.design.command;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 10:07
 */

public class Invoker {
    private Command[] onCommand;
    private Command[] offCOmmand;

    private final int slotNum = 7;

    public Invoker() {
        this.onCommand = new Command[slotNum];
        this.offCOmmand = new Command[slotNum];
    }


    public void setOnCommand(Command onCommand, int slot) {
        this.onCommand[slot] = onCommand;
    }


    public void setOffCOmmand(Command offCOmmand, int slot) {
        this.offCOmmand[slot] = offCOmmand;
    }

    public void onButtonPush(int slot) {
        onCommand[slot].excute();
    }

    public void offButtonPush(int slot) {
        offCOmmand[slot].excute();
    }
}
