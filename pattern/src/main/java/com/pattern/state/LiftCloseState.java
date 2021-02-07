package com.pattern.state;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class LiftCloseState extends LiftState{

    @Override
    void open() {
        super.context.setLiftState(LiftContext.openState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("close the door of lift.");
    }

    @Override
    void stop() {
        super.context.setLiftState(LiftContext.stopState);
        super.context.getLiftState().stop();
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
