package com.siyehua.chapter4.abs;

import com.siyehua.chapter4.abs.pizza.Pizza;
import com.siyehua.chapter4.abs.store.NYPizzaStore;
import com.siyehua.chapter4.abs.store.PizzaStore;

/**
 * Created by huangxk on 2017/2/5.
 */
public class PizzaTestDirver {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("1");

        System.out.print(pizza.getName() + "  " + pizza.getDesc());
    }
}
