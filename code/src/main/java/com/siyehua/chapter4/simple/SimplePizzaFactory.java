package com.siyehua.chapter4.simple;

/**
 * Created by huangxk on 2017/2/5.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        if (type.equals("1")) {
            return new NYPizza();
        } else return new ChinaPizza();
    }
}
