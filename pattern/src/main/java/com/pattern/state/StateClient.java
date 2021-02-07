package com.pattern.state;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class StateClient {

    public static void main(String[] args) {
        LiftContext context = new LiftContext();
        context.setLiftState(LiftContext.onState);
        context.open();
        context.close();
        context.run();
        context.stop();
        context.open();
        context.stop();
    }
}
