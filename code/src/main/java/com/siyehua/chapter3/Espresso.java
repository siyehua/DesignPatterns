package com.siyehua.chapter3;

/**
 * 浓缩咖啡
 * Created by huangxk on 2017/2/4.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
