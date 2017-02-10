package com.siyehua.chapter7.adapter;

/**
 * 火鸡适配器,将火鸡转换成鸭子
 * Created by huangxk on 2017/2/8.
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
