package com.siyehua.chapter8;

/**
 * Created by huangxk on 2017/2/10.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.print("brew coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("add sugar");
    }
}
