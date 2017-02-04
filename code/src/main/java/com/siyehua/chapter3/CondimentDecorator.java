package com.siyehua.chapter3;

/**
 * 调料类,装饰饮料类,继承是为了与被装饰者是同一个类型
 * Created by huangxk on 2017/2/4.
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
