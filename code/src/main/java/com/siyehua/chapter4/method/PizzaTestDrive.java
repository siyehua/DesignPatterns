package com.siyehua.chapter4.method;

/**
 * Created by huangxk on 2017/2/5.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("1");
        System.out.print(pizza.getName());
    }
}
