package com.siyehua.chapter8;

/**
 * Created by huangxk on 2017/2/10.
 */
public abstract class CaffeineBeverage {
    /**
     * 模板方法
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (addCondimentFlag()) addCondiments();
    }

    public void boilWater() {
        System.out.println("Boiling Water");
    }

    public abstract void brew();

    public void pourInCup() {
        System.out.println("pour beverage into cup");

    }

    public abstract void addCondiments();

    /**
     * 钩子方法
     *
     * @return
     */
    public boolean addCondimentFlag() {
        return true;
    }

    public static void main(String[] args) {
        CaffeineBeverage beverage = new Tea();
        beverage.prepareRecipe();

        beverage = new Coffee();
        beverage.prepareRecipe();
    }
}
