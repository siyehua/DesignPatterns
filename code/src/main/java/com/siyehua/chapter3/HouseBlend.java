package com.siyehua.chapter3;

/**
 * Created by huangxk on 2017/2/4.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }

}
