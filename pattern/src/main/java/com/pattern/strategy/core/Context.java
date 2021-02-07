package com.pattern.strategy.core;

/**
 * @author Yong
 * @date 2021/2/6
 * 上下文类
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void play() {
        strategy.play();
    }

}
