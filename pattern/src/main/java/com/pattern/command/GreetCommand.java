package com.pattern.command;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class GreetCommand implements Command{

    private final Receiver receiver;

    public GreetCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.greet();
    }
}
