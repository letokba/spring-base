package com.pattern.state;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class LiftStopState extends LiftState{

    @Override
    void open() {
        super.context.setLiftState(LiftContext.openState);
        super.context.getLiftState().open();
    }

    @Override
    void close() {
        System.err.println("the lift's door has been closed.");
    }

    @Override
    public void stop() {
        System.out.println("the lift has stop.");
    }

    @Override
    void run() {
        super.context.setLiftState(LiftContext.runState);
        super.context.getLiftState().run();
    }

    @Override
    void on() {
        super.context.setLiftState(LiftContext.onState);
        super.context.getLiftState().on();
    }

    @Override
    void off() {
        super.context.setLiftState(LiftContext.offState);
        super.context.getLiftState().off();
    }
}
