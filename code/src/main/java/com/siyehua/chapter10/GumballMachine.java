package com.siyehua.chapter10;

/**
 * Created by huangxk on 2017/2/12.
 */
public class GumballMachine implements State{
    private SoldOutState outState;
    private SoldState soldState;
    private NoQuarteState noQuarteState;
    private HasQuarteState hasQuarteState;

    private State state;
    private int number;

    public GumballMachine() {
        outState = new SoldOutState(this);
        soldState = new SoldState(this);
        noQuarteState = new NoQuarteState(this);
        hasQuarteState = new HasQuarteState(this);

        number = 0;
        state = outState;
    }

    @Override
    public void insertQuater() {
        state.insertQuater();
    }

    @Override
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    @Override
    public void turnCrank() {
        state.turnCrank();
    }

    @Override
    public void dispense() {
        state.dispense();
    }

    public SoldOutState getOutState() {
        return outState;
    }

    public void setOutState(SoldOutState outState) {
        this.outState = outState;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    public void setSoldState(SoldState soldState) {
        this.soldState = soldState;
    }

    public NoQuarteState getNoQuarteState() {
        return noQuarteState;
    }

    public void setNoQuarteState(NoQuarteState noQuarteState) {
        this.noQuarteState = noQuarteState;
    }

    public HasQuarteState getHasQuarteState() {
        return hasQuarteState;
    }

    public void setHasQuarteState(HasQuarteState hasQuarteState) {
        this.hasQuarteState = hasQuarteState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        if (number > 0) {
            state = noQuarteState;
        }
    }
}
