package com.gaospot.design.chainofresponsibility;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 17:30
 */

public class HandlerImp2 extends Handler {


    public HandlerImp2(Handler handler) {
        super(handler);
    }


    @Override
    public void handlerRequest(Request request) {
        if (request.getType() == RequestType.TYPE2) {
            System.out.println(request.getName() + " is handle by HandlerImp2");
            return;
        }
        if (handler != null) {
            handler.handlerRequest(request);
        }
    }
}
