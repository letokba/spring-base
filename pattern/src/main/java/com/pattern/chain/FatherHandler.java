package com.pattern.chain;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class FatherHandler extends Handler {
    @Override
    protected Level getLevel() {
        return Level.FATHER;
    }

    @Override
    protected Response echo(Request request) {
        System.out.println("Father...");
        System.out.println("request：" + request);
        return Response.agree();
    }
}
