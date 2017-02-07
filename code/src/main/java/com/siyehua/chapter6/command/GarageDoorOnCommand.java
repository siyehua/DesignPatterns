package com.siyehua.chapter6.command;

import com.siyehua.chapter6.factoryclass.GarageDoor;

/**
 * Created by huangxk on 2017/2/7.
 */
public class GarageDoorOnCommand implements Command {
    private GarageDoor door;

    public GarageDoorOnCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }

    @Override
    public void undo() {
        door.off();
    }
}
