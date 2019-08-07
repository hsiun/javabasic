package com.gaospot.design.observer;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-07 09:46
 */

public interface Observer {

    void update(final float temp, final float humidity, final float pressure);
}
