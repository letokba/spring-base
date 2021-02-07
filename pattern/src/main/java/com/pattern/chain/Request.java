package com.pattern.chain;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class Request {
    private final String context;
    private final Level level;

    public Request(String context, Level level) {
        this.context = context;
        this.level = level;
    }

    public String getContext() {
        return context;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Request{" +
                "context='" + context + '\'' +
                ", level=" + level +
                '}';
    }
}
