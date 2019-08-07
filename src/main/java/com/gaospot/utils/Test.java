package com.gaospot.utils;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-07-10 17:44
 */

public class Test {

    public static void main(String[] args) {

        String dbName = "LG-DB-0001,LG-DB-0001";

        String[] split = dbName.split(",");
        StringBuilder sb = new StringBuilder();
        for (int j=0; j<split.length; j++) {
            String db = split[j];
            String dburl = "aaa";
            if (sb.length()>0) {
                sb.append(",");
            }
            sb.append(dburl).append("(").append(dburl).append(")");
        }
        System.out.println("sb.toStirng" + sb.toString());
    }
}
