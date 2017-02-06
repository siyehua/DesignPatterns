package com.siyehua.chapter4.abs.store;

import com.siyehua.chapter4.abs.factory.NyFactory;
import com.siyehua.chapter4.abs.pizza.ChinaPizza;
import com.siyehua.chapter4.abs.pizza.Pizza;
import com.siyehua.chapter4.abs.pizza.TeaPizza;

/**
 * Created by huangxk on 2017/2/5.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("1")) return new ChinaPizza(new NyFactory());
        return new TeaPizza(new NyFactory());
    }
}
