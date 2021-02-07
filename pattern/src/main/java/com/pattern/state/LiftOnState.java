package com.pattern.state;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class LiftOnState extends LiftState{

    @Override
    void open() {
        super.context.setLiftState(LiftContext.openState);
        super.context.getLiftState().open();
    }

    @Override
    void close() {
        super.context.setLiftState(LiftContext.closeState);
        super.context.getLiftState().close();
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
        System.out.println("the lift is on.");
    }

    @Override
    void off() {
        super.context.setLiftState(LiftContext.offState);
        super.context.getLiftState().off();
    }
}
