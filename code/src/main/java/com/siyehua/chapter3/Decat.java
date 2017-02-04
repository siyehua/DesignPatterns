package com.siyehua.chapter3;

/**
 * Created by huangxk on 2017/2/4.
 */
public class Decat extends Beverage {
    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
