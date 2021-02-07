package com.pattern.state;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class LiftRunState extends LiftState{

    @Override
    void open() {
        System.err.println("must not opening door when lift is running.");

    }

    @Override
    void close() {
        System.err.println("the lift's door has been closed.");
    }

    @Override
    void stop() {
        super.context.setLiftState(LiftContext.stopState);
        super.context.getLiftState().stop();
    }

    @Override
    public void run() {
        System.out.println("the lift is running.");
    }

    @Override
    void on() {
        System.err.println("the lift's door has been on.");
    }

    @Override
    void off() {
        System.err.println("must not off lift when lift is running.");
    }
}
