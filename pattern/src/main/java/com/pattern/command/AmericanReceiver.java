package com.pattern.command;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class AmericanReceiver implements Receiver{
    @Override
    public void greet() {
        System.out.println("Hello, I'm Jack.");
    }
}
