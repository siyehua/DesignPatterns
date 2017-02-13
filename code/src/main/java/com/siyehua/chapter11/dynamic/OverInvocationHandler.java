package com.siyehua.chapter11.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by huangxk on 2017/2/13.
 */
public class OverInvocationHandler implements InvocationHandler {
    private PersonBean bean;

    public OverInvocationHandler(PersonBean bean) {
        this.bean = bean;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        if (method.getName().contains("HotOrNot")) {
            return method.invoke(bean, objects);
        } else if (method.getName().startsWith("set")) {
            return method.invoke(bean, objects);
        } else if (method.getName().startsWith("get")) {
            throw new IllegalAccessException();
        }
        return null;
    }
}
