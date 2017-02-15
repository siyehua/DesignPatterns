package com.siyehua.chapter12.model;

/**
 * Created by huangxk on 2017/2/15.
 */
public class UserBean {
    private String name;
    private String password;

    public UserBean(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
