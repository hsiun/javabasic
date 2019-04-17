package com.gaospot.concurrency;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/14 6:02 PM
 * @description: 模拟银行的类
 */

public class Bank {
    public static void main(String[] args) {

        TrickWindows trickWindows = new TrickWindows("柜台1");
        trickWindows.start();

        TrickWindows trickWindows1 = new TrickWindows("柜台2");
        trickWindows1.start();

        TrickWindows trickWindows2 = new TrickWindows("柜台3");
        trickWindows2.start();

    }

}
