package com.pattern.chain;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class HusbandHandler extends Handler {
    @Override
    protected Level getLevel() {
        return Level.HUSBAND;
    }

    @Override
    protected Response echo(Request request) {
        System.out.println("Husband...");
        System.out.println("request：" + request);
        int length = request.getContext().length();
        return length > 5 ? Response.disagree() : Response.agree();
    }
}
