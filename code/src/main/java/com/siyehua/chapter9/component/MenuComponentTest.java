package com.siyehua.chapter9.component;

/**
 * Created by huangxk on 2017/2/11.
 */
public class MenuComponentTest {
    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        waitress.print(new Menu());
        waitress.print(new MenuItem());

    }
}
