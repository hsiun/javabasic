package com.gaospot.design.chainofresponsibility;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 17:29
 */

public abstract class Handler  {

    protected Handler handler;

    public Handler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handlerRequest(Request request);
}
