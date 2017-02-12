package com.siyehua.chapter10;

/**
 * Created by huangxk on 2017/2/12.
 */
public class HasQuarteState implements State {
    private GumballMachine gumballMachine;

    public HasQuarteState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("It has been coins.!!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("eject quarter....");
        gumballMachine.setState(gumballMachine.getNoQuarteState());
    }

    @Override
    public void turnCrank() {
        System.out.println("turn crank....");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("please turn crank...");

    }
}
