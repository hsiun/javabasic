package com.gaospot.design.chainofresponsibility;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 17:33
 */

public class Client {

    public static void main(String[] args) {
        Handler handler = new HandlerImp1(null);
        Handler handler1 = new HandlerImp2(handler);

        Request request1 = new Request(RequestType.TYPE1, "request1");
        handler.handlerRequest(request1);

        Request request2 = new Request(RequestType.TYPE2, "request2");
        handler1.handlerRequest(request2);
    }
}
