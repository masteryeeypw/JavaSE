package com.javase.F命令模式;

/**
 * @Author MASTERYEE
 * @Date 2018/9/23 21:19
 * 遥控器
 **/
public class SimpleRemoteControl {

    Command command;

    public SimpleRemoteControl() {
    }


    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
