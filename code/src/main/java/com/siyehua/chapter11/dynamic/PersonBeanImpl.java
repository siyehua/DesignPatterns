package com.siyehua.chapter11.dynamic;

/**
 * Created by huangxk on 2017/2/13.
 */
public class PersonBeanImpl implements PersonBean {
    private String name;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String string) {
        this.name = string;
    }

    @Override
    public void setHotOrNotRating(int rating) {

    }

}
