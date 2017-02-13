package com.siyehua.chapter11.virtual;

/**
 * Created by huangxk on 2017/2/13.
 */
public class MyImagePoxy implements MyImage {
    MyImageView imageView;


    @Override
    public void setUrl() {
        System.out.println("setUrl");
    }

    @Override
    public void down() {
        System.out.println("down");

    }

    @Override
    public void show() {
        if (imageView == null) imageView = new MyImageView();
        imageView.show();

    }
}
