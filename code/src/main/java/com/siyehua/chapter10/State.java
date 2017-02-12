package com.siyehua.chapter10;

/**
 * Created by huangxk on 2017/2/12.
 */
public interface State {

    /**
     * 投入硬币
     */
    void insertQuater();

    /**
     * 退出硬币
     */
    void ejectQuarter();

    /**
     * 转动按钮
     */
    void turnCrank();

    /**
     * 出糖果
     */
    void dispense();

}
