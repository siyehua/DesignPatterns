package com.siyehua.chapter3;

/**
 * Created by huangxk on 2017/2/4.
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Mocha " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
