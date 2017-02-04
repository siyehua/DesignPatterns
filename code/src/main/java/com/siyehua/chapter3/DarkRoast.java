package com.siyehua.chapter3;

/**
 * Created by huangxk on 2017/2/4.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
