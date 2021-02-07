package com.pattern.command;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
