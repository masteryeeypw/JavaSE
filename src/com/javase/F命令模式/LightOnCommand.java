package com.javase.F命令模式;

/**
 * @Author MASTERYEE
 * @Date 2018/9/23 21:16
 * 灯光命令
 **/
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
