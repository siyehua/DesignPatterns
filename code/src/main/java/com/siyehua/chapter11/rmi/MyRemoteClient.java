package com.siyehua.chapter11.rmi;

import java.rmi.Naming;

/**
 * Created by huangxk on 2017/2/12.
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.print(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
