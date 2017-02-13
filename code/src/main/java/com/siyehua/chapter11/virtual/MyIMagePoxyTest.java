package com.siyehua.chapter11.virtual;

/**
 * Created by huangxk on 2017/2/13.
 */
public class MyIMagePoxyTest {
    public static void main(String[] args) {
        //开启代理
        MyImage image = new MyImagePoxy();
        image.setUrl();
        image.down();

        //前两个步骤ImagView都没有创建,这个步骤才被创建出来
        image.show();

    }
}
