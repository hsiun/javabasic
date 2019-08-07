package com.gaospot.design.prototype;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 17:09
 */

public class PrototypeImpl extends Prototype {

    private String fild;

    public PrototypeImpl(String fild) {
        this.fild = fild;
    }

    @Override
    Prototype myClone() {
        return new PrototypeImpl(fild);
    }


    @Override
    public String toString() {
        return fild;
    }
}
