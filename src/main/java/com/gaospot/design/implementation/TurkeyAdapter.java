package com.gaospot.design.implementation;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 17:23
 */

public class TurkeyAdapter implements Duck {
    private Turkey turkey;


    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }


    @Override
    public void quack() {
        turkey.gobble();
    }
}
