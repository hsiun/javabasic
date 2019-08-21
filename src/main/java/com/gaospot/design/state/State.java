package com.gaospot.design.state;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-13 11:22
 */
public interface State {

    /**
     * 投入 25 分钱
     */
    void insertQuarter();

    /**
     * 退回 25 分钱
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
