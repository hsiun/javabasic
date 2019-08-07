package com.gaospot.design.chainofresponsibility;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 17:30
 */

public class HandlerImp1 extends Handler {


    public HandlerImp1(Handler handler) {
        super(handler);
    }


    @Override
    public void handlerRequest(Request request) {
        if (request.getType() == RequestType.TYPE1) {
            System.out.println(request.getName() + " is handle by HandlerImp1");
            return;
        }
        if (handler != null) {
            handler.handlerRequest(request);
        }
    }
}
