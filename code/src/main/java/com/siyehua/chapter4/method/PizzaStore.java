package com.siyehua.chapter4.method;


/**
 * Created by huangxk on 2017/2/5.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
