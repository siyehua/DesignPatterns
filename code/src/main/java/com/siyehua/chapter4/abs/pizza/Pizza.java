package com.siyehua.chapter4.abs.pizza;


import com.siyehua.chapter4.abs.factory.PizzaIngredientFactory;

/**
 * Created by siyehua on 2017/2/5.
 */
public class Pizza {
    protected String name;
    protected String desc;
    protected PizzaIngredientFactory ingredientFactory;

    public Pizza() {
        name = "pizza";
        desc = "desc";
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void prepare() {

    }

    public void bake() {

    }

}