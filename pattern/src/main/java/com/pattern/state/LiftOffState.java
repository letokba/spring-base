package com.pattern.state;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class LiftOffState extends LiftState{
    @Override
    void open() {
        System.err.println("can't open the door when lift is off.");
    }

    @Override
    void close() {
        System.err.println("can't close the door when lift is off.");
    }

    @Override
    void stop() {
        System.err.println("the lift has been stop.");

    }

    @Override
    void run() {
        System.err.println("can't run when lift is off.");
    }

    @Override
    void on() {
        super.context.setLiftState(LiftContext.onState);
        super.context.getLiftState().on();
    }

    @Override
    void off() {
        System.out.println("the lift will be off.");
    }
}
