package com.pattern.command;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class ChineseReceiver implements Receiver{
    @Override
    public void greet() {
        System.out.println("你好，我是张三.");
    }
}
