package com.siyehua.chapter3;

/**
 * Created by huangxk on 2017/2/4.
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Soy " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }


}
