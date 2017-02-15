package com.siyehua.chapter12.model;

/**
 * Created by huangxk on 2017/2/15.
 */
public class ModelImpl implements LoginInterface {
    @Override
    public void login(final String name, final String password, final LoginCallBack callBack) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (name.equals("123")) callBack.success();
                else callBack.fail("name or password error!");

            }
        }.start();
    }
}
