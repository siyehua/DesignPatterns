package com.siyehua.chapter4.abs.pizza;

import com.siyehua.chapter4.abs.factory.PizzaIngredientFactory;

/**
 * Created by huangxk on 2017/2/5.
 */
public class ChinaPizza extends Pizza {
    public ChinaPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "China pizza";
    }
}
