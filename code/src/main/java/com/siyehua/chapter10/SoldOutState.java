package com.siyehua.chapter10;

/**
 * Created by huangxk on 2017/2/12.
 */
public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("no candy");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("no candy");

    }

    @Override
    public void turnCrank() {
        System.out.println("no candy");

    }

    @Override
    public void dispense() {
        System.out.println("no candy");

    }
}
