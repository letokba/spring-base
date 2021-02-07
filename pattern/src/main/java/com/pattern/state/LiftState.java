package com.pattern.state;

/**
 * @author Yong
 * @date 2021/2/7
 */
public abstract class LiftState {
    protected LiftContext context;

    public void setContext(LiftContext context) {
        this.context = context;
    }


    abstract void open();

    abstract void close();

    abstract void stop();

    abstract void run();

    abstract void on();

    abstract void off();
}
