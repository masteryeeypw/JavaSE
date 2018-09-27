package com.javase.F命令模式;

/**
 * @Author MASTERYEE
 * @Date 2018/9/23 21:31
 * 车库门开关命令
 **/
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.on();
    }
}
