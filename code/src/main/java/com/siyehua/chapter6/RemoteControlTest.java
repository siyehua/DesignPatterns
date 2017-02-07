package com.siyehua.chapter6;

import com.siyehua.chapter6.command.GarageDoorOffCommand;
import com.siyehua.chapter6.command.GarageDoorOnCommand;
import com.siyehua.chapter6.command.LightOffCommand;
import com.siyehua.chapter6.command.LightOnCommand;
import com.siyehua.chapter6.factoryclass.GarageDoor;
import com.siyehua.chapter6.factoryclass.Light;

/**
 * Created by huangxk on 2017/2/7.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        //新建一个遥控器
        RemoteControl control = new RemoteControl();

        //安装卧室灯泡
        Light roomLight = new Light("room");
        //安装浴室灯泡
        Light wastshRoomLight = new Light("wash");
        //安装车库门
        GarageDoor door = new GarageDoor();

        //安装开关
        LightOnCommand roomOnCommand = new LightOnCommand(roomLight);
        LightOffCommand roomOffCommand = new LightOffCommand(roomLight);
        LightOnCommand washOnCommand = new LightOnCommand(wastshRoomLight);
        LightOffCommand washOffCommand = new LightOffCommand(wastshRoomLight);
        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(door);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(door);


        //设置遥控器对应键控制开关命令
        control.setCommand(0, roomOnCommand, roomOffCommand);
        control.setCommand(1, washOnCommand, washOffCommand);
        control.setCommand(2, garageDoorOnCommand, garageDoorOffCommand);

        System.out.println(control);

        control.onButtonClick(0);
        control.offButtonClick(0);
        control.onButtonClick(1);
        control.offButtonClick(1);
        control.onButtonClick(2);
        control.offButtonClick(2);
    }
}
