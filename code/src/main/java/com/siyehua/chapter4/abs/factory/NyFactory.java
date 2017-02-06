package com.siyehua.chapter4.abs.factory;

/**
 * Created by huangxk on 2017/2/5.
 */
public class NyFactory implements PizzaIngredientFactory {
    @Override
    public String getDesc() {
        return "Ny Factory";
    }
}
