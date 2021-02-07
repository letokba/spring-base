package com.pattern.chain;

/**
 * @author Yong
 * @date 2021/2/7
 */
public abstract class Handler {

    private Handler nextHandler;


    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final Response handleMessage(Request request) {
        Response response = null;
        if(getLevel().equals(request.getLevel())) {
            response = echo(request);
        }else {
            if(nextHandler != null) {
                response = nextHandler.handleMessage(request);
            }
        }
        return response;
    }


    protected abstract Level getLevel();

    protected abstract Response echo(Request request);

}
