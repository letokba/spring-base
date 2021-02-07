package com.pattern.strategy.core;

/**
 * @author Yong
 * @date 2021/2/6
 */
public class OneStrategy implements Strategy{
    @Override
    public void play() {
        System.out.println("play one.");
    }
}
