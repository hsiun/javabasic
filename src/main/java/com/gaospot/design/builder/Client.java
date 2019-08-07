package com.gaospot.design.builder;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 17:01
 */

public class Client {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(16);

        for (int i=0; i<26; i++) {
            sb.appender((char)( 'a' + i));
        }


        System.out.println(sb.toString());
    }
}
