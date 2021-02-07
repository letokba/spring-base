package com.pattern.strategy.core;

/**
 * @author Yong
 * @date 2021/2/6
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new SecondStrategy();
        Context context = new Context(strategy);
        context.play();
    }
}
