package com.pattern.state;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class LiftOpenState extends LiftState{

    @Override
    public void open() {
        System.out.println("open the door of lift.");

    }

    @Override
    void close() {
        super.context.setLiftState(LiftContext.closeState);
        super.context.getLiftState().close();
    }

    @Override
    void stop() {
        System.err.println("the lift has been stopped.");
    }

    @Override
    void run() {
        System.err.println("must not run lift in opening door.");
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
