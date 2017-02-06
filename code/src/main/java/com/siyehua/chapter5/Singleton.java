package com.siyehua.chapter5;

/**
 * Created by huangxk on 2017/2/6.
 */
public class Singleton {

    private Singleton() {
    }

    public static volatile Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
