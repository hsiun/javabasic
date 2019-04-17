package com.gaospot.properties;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/2/19 2:32 PM
 * @description: 属性文件读取通用类
 */

public class PropertiesUtil {


    /**
     * 配置文件读取的通用方法
     *
     * 1，新建Properties对象
     * 2，新建配置文件对应的inputstream
     * 3，通过Properties的方法加载文件流
     * 4，读取属性
     */

    /**
     * 配置文件加载类，通过static限制不生成对象
     */
    public static void readProperitesByClassload(String filePath, String keyWord) {
        Properties properties = new Properties();
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(filePath));

            //InputStream in = new FileInputStream(filePath);
            properties.load(in);
            Iterator<String> it = properties.stringPropertyNames().iterator();
            while (it.hasNext()) {
                String key = it.next();
                System.out.println("key = " + properties.getProperty(key));
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {
        //各种方法的不同主要在于读取配置文件的方式的不同
    }


}
