package com.siyehua.chapter11.virtual;

/**
 * Created by huangxk on 2017/2/13.
 */
public class MyImageView implements MyImage{

    //MyImageView是一个非常复杂的类,所以需要一个代理来操作它.

    @Override
    public void setUrl() {

    }

    @Override
    public void down() {

    }

    @Override
    public void show() {
        System.out.println("MyImageView show");
    }

    //下面还有很多方法.....
}
