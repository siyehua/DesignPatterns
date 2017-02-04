package com.siyehua.chapter2;

/**
 * Created by huangxk on 2017/2/3.
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserve(Observer observer);

    void notifyObserves();

}
