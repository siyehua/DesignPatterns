package com.siyehua.chapter6;

import com.siyehua.chapter6.command.Command;
import com.siyehua.chapter6.command.NoCommand;

import java.util.Arrays;

/**
 * 遥控器
 * Created by huangxk on 2017/2/7.
 */
public class RemoteControl {
    private Command[] onCommand;
    private Command[] offCommand;

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        for (int i = 0; i < 7; i++) {
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
    }

    public void setCommand(int index, Command on,Command off) {
        onCommand[index] = on;
        offCommand[index] = off;

    }

    public void onButtonClick(int index) {
        onCommand[index].execute();
    }

    public void offButtonClick(int index) {
        offCommand[index].execute();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommand=" + Arrays.toString(onCommand) +
                ", offCommand=" + Arrays.toString(offCommand) +
                '}';
    }
}
