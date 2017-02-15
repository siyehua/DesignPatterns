package com.siyehua.chapter12.model;

/**
 * Created by huangxk on 2017/2/15.
 */
public interface LoginCallBack {
    void success();

    void fail(String error);
}
