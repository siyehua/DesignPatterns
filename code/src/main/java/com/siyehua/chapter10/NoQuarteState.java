package com.siyehua.chapter10;

/**
 * Created by huangxk on 2017/2/12.
 */
public class NoQuarteState implements State{
    private GumballMachine gumballMachine;

    public NoQuarteState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("insert a coin success.");
        gumballMachine.setState(gumballMachine.getHasQuarteState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("no coin");

    }

    @Override
    public void turnCrank() {
        System.out.println("no coin");

    }

    @Override
    public void dispense() {
        System.out.println("no coin");

    }
}
