package com.pattern.pubsub;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.attach(new OneObserver());
        subject.attach(new SecondObserver());

        subject.notify("eat...");
    }
}
