package com.siyehua.chapter6.command;

import com.siyehua.chapter6.factoryclass.Light;

/**
 * Created by huangxk on 2017/2/7.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
