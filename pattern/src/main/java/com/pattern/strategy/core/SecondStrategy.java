package com.pattern.strategy.core;

/**
 * @author Yong
 * @date 2021/2/6
 */
public class SecondStrategy implements Strategy{
    @Override
    public void play() {
        System.out.println("play second.");
    }
}
