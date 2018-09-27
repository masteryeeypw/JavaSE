package com.javase.F命令模式;

/**
 * @Author MASTERYEE
 * @Date 2018/9/26 20:34
 **/
public class RemoteControl {
    Command[] onCommonds;
    Command[] offCommands;

    public RemoteControl() {
        this.onCommonds = new Command[7];
        this.offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommonds[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommond(int slot, Command onCommand, Command offCommand) {
        onCommonds[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommonds[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }



}
