package com.siyehua.chapter11.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by huangxk on 2017/2/12.
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
