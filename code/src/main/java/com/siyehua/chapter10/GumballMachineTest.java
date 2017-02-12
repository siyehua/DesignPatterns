package com.siyehua.chapter10;

/**
 * Created by huangxk on 2017/2/12.
 */
public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine();
        System.out.println(machine.getState().getClass().getSimpleName() + "\n");


        machine.setNumber(1);
//        machine.setNumber(2);
        System.out.println(machine.getState().getClass().getSimpleName() + "\n");


        machine.insertQuater();
        System.out.println(machine.getState().getClass().getSimpleName() + "\n");

//        machine.ejectQuarter();
//        System.out.println(machine.getState().getClass().getSimpleName() + "\n");

        machine.turnCrank();
        System.out.println(machine.getState().getClass().getSimpleName() + "\n");

//        machine.turnCrank();
//        System.out.println(machine.getState().getClass().getSimpleName() + "\n");



        machine.dispense();
        System.out.println(machine.getState().getClass().getSimpleName() + "\n");



    }
}
