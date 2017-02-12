package com.siyehua.chapter10;

/**
 * Created by huangxk on 2017/2/12.
 */
public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("solding... please wait.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("solding... please wait.");
    }

    @Override
    public void turnCrank() {
        System.out.println("solding... please wait.");
    }

    @Override
    public void dispense() {
        System.out.println("solding... please wait.");
        gumballMachine.setNumber(gumballMachine.getNumber() - 1);
        System.out.println("candy out. welcome  to you next time.");
        if (gumballMachine.getNumber() == 0) {
            gumballMachine.setState(gumballMachine.getOutState());
        } else gumballMachine.setState(gumballMachine.getNoQuarteState());
    }
}
