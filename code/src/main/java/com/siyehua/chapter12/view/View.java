package com.siyehua.chapter12.view;

import com.siyehua.chapter12.present.LoginPresent;

/**
 * Created by huangxk on 2017/2/15.
 */
public class View implements ViewInterface {
    private String name;
    private String password;
    private LoginPresent present;

    public View() {
        this.present = new LoginPresent(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void result(String resultStr) {
        System.out.println(resultStr);
    }

    public void clickLogin() {
        present.login();
    }
}
