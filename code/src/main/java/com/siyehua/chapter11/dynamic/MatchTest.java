package com.siyehua.chapter11.dynamic;

import java.lang.reflect.Proxy;

/**
 * Created by huangxk on 2017/2/13.
 */
public class MatchTest {
    public static void main(String[] args) {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("21");
        PersonBean overBean = getOverProxy(joe);
//        System.out.println(overBean.getName());
        overBean.setHotOrNotRating(1);

        PersonBean nonPersonBean = getNonProxy(joe);
        System.out.println(nonPersonBean.getName());
        nonPersonBean.setHotOrNotRating(1);
    }

    public static PersonBean getOverProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(), new OverInvocationHandler(personBean));

    }

    public static PersonBean getNonProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(), new NonIncocationHandler(personBean));
    }
}
