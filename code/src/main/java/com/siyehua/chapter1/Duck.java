package com.siyehua.chapter1;

import com.siyehua.chapter1.fly.FlyBehavior;
import com.siyehua.chapter1.quack.QuackBehavior;

/**
 * Created by siyehua on 2017/2/3.
 */
public abstract class Duck {
   protected FlyBehavior flyBehavior;
   protected QuackBehavior quackBehavior;

    public Duck() {
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public  void swim(){
        System.out.println("All duck can swim...");
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
