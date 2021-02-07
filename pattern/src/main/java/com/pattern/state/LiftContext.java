package com.pattern.state;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class LiftContext {
    public static LiftState openState = new LiftOpenState();
    public static LiftState closeState = new LiftCloseState();
    public static LiftState runState = new LiftRunState();
    public static LiftState stopState = new LiftStopState();
    public static LiftState onState = new LiftOnState();
    public static LiftState offState = new LiftOffState();

    private LiftState liftState;



    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public LiftState getLiftState() {
        return liftState;
    }


    public void stop() {
        liftState.stop();
    }

    public void run() {
        liftState.run();
    }

    public void open() {
        liftState.open();
    }

    public void close() {
        liftState.close();
    }

    public void on() {
        liftState.on();
    }

    public void off() {
        liftState.off();
    }

}
