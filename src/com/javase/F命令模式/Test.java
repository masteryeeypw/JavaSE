package com.javase.F命令模式;

/**
 * @Author MASTERYEE
 * @Date 2018/9/23 21:21
 **/
public class Test {


    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        Command command = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        control.setCommand(command);
        control.buttonWasPressed();

        control.setCommand(garageDoorOpenCommand);
        control.buttonWasPressed();

    }
}
