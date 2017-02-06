package com.siyehua.chapter4.simple;

/**
 * Created by siyehua on 2017/2/5.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        System.out.print(store.orderPizza("2").getName());
    }
}
