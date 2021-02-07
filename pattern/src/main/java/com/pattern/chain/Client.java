package com.pattern.chain;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class Client {

    public static void main(String[] args) {
        Handler handler = new FatherHandler();
        HusbandHandler husband = new HusbandHandler();
        handler.setNextHandler(husband);
        Response r = handler.handleMessage(new Request("I want to go shopping", Level.FATHER));
        System.out.println(r);
        Response r2 = handler.handleMessage(new Request("I want to go shopping", Level.HUSBAND));
        System.out.println(r2);

    }

}
