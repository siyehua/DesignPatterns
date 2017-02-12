package com.siyehua.chapter9.component;

/**
 * Created by huangxk on 2017/2/11.
 */
public class Waitress {
    public void print(MenuComponent component) {
        try {
            component.getName();
            component.getDesc();
            component.print();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
