package com.siyehua.chapter8;

/**
 * Created by huangxk on 2017/2/10.
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("brew tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("addCondiments tea");
    }

    @Override
    public boolean addCondimentFlag() {
        return false;
    }
}
