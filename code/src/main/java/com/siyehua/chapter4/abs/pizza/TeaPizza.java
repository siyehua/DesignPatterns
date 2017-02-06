package com.siyehua.chapter4.abs.pizza;

import com.siyehua.chapter4.abs.factory.PizzaIngredientFactory;

/**
 * Created by huangxk on 2017/2/5.
 */
public class TeaPizza extends Pizza {
    public TeaPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Tea pizza";
    }
}
