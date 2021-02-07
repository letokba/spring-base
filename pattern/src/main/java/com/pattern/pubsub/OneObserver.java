package com.pattern.pubsub;

import java.util.Observable;
/**
 * @author Yong
 * @date 2021/2/7
 */
public class OneObserver implements Observer{
    @Override
    public void update(String message) {
        System.out.println("One: " + message);
    }
}
