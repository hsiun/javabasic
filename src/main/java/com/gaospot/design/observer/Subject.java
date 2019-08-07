package com.gaospot.design.observer;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-07 09:44
 */

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObserver();
}
