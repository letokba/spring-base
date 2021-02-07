package com.pattern.pubsub;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class SecondObserver implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Second: " + message);
    }
}
