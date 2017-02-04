package com.siyehua.chapter1;

import com.siyehua.chapter1.fly.FlyWithNo;
import com.siyehua.chapter1.fly.FlyWithWings;
import com.siyehua.chapter1.quack.Quack;

/**
 * Created by huangxk on 2017/2/3.
 */
public class ModuleDuck extends Duck {
    public ModuleDuck() {
        flyBehavior = new FlyWithNo();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.print("model duck");
    }

    public static void main(String[] agrs) {
        Duck duck = new ModuleDuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
    }
}
