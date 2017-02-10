package com.siyehua.chapter7.adapter;

/**
 * Created by huangxk on 2017/2/8.
 */
public class HotTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("I can fly a short distance.");
    }
}
