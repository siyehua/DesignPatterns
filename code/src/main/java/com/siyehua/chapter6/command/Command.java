package com.siyehua.chapter6.command;

/**
 * Created by huangxk on 2017/2/7.
 */
public interface Command {
    void execute();

    void undo();
}
