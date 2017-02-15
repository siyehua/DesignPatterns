package com.siyehua.chapter12;

import com.siyehua.chapter12.view.View;

/**
 * Created by huangxk on 2017/2/15.
 */
public class ViewTest {
    public static void main(String[] args) {
        View view = new View();
        view.setName("456");
        view.setPassword("123");

        view.clickLogin();
    }
}
