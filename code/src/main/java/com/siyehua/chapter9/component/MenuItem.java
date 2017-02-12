package com.siyehua.chapter9.component;

/**
 * Created by huangxk on 2017/2/11.
 */
public class MenuItem extends MenuComponent{
    @Override
    public void getName() {
        System.out.println("MenuItem");
    }

    @Override
    public void getDesc() {
        System.out.println("getDesc");
    }
}
