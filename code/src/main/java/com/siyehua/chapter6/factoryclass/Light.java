package com.siyehua.chapter6.factoryclass;

/**
 * Created by huangxk on 2017/2/7.
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " light on.");
    }

    public void off() {
        System.out.println(name + " light off.");
    }
}
