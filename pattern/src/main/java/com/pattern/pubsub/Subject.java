package com.pattern.pubsub;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yong
 * @date 2021/2/7
 *
 * 被观察者
 */
public class Subject {

    private final List<Observer> observers = new ArrayList<>(10);



    public void  attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }


}
