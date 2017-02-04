package com.siyehua.chapter1.quack;

/**
 * Created by huangxk on 2017/2/3.
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("guaguagua...");
    }
}
