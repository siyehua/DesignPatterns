package com.siyehua.chapter4.method;


/**
 * Created by huangxk on 2017/2/5.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("1")) return new NYPizza();
        else return new ChinaPizza();
    }
}
