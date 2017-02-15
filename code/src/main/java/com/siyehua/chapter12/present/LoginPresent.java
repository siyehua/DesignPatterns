package com.siyehua.chapter12.present;

import com.siyehua.chapter12.model.LoginCallBack;
import com.siyehua.chapter12.model.LoginInterface;
import com.siyehua.chapter12.model.ModelImpl;
import com.siyehua.chapter12.view.ViewInterface;

/**
 * Created by huangxk on 2017/2/15.
 */
public class LoginPresent {
    private ViewInterface viewInterface;
    private LoginInterface loginInterface;

    public LoginPresent(ViewInterface viewInterface) {
        this.viewInterface = viewInterface;
        loginInterface = new ModelImpl();
    }

    public void login() {
        loginInterface.login(viewInterface.getName(), viewInterface.getPassword(), new
                LoginCallBack() {
            @Override
            public void success() {
                viewInterface.result("success");
            }

            @Override
            public void fail(String error) {
                viewInterface.result(error);
            }
        });
    }
}
