package com.siyehua.chapter7.adapter;

/**
 * Created by huangxk on 2017/2/8.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("guaguagua");
    }

    @Override
    public void fly() {
        System.out.print("I can't fly");
    }
}
