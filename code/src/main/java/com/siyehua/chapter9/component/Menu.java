package com.siyehua.chapter9.component;

/**
 * Created by huangxk on 2017/2/11.
 */
public class Menu extends MenuComponent {
    @Override
    public void getName() {
        System.out.println("menu");
    }


    @Override
    public void print() {
        System.out.println("print menu");
    }
}
