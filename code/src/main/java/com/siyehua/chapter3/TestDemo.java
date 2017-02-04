package com.siyehua.chapter3;

/**
 * Created by huangxk on 2017/2/4.
 */
public class TestDemo {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Soy(beverage);
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        System.out.print(beverage.getDescription() + "   " + beverage.cost());
    }
}
