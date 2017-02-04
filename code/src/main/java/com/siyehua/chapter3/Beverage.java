package com.siyehua.chapter3;

/**
 * 饮料类
 * Created by huangxk on 2017/2/4.
 */
public abstract class Beverage {
    protected String description = "Default Beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
