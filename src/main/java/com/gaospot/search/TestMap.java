package com.gaospot.search;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-05-21 20:17
 */

public class TestMap {
    public static void main(String[] args) {

        Map map = new HashMap();
        String s = "abc";
        String t = "efe";
        for(Integer i=0; i<s.length(); i++) {
            System.out.println("s = " + map.put(s.charAt(i), i));
            System.out.println("j = " + map.put(t.charAt(i), i));
        }

    }
}
