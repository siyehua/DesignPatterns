package com.siyehua.chapter4.abs.store;


import com.siyehua.chapter4.abs.pizza.Pizza;

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

    public abstract Pizza createPizza(String type);
}
