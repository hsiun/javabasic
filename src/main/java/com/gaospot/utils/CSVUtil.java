package com.gaospot.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * CSV文件解析的工具类
 * Created by gao on 2018/10/12.
 */
public class CSVUtil {

    private static final String FILE = "/Users/gao/CAPES_KIDA7-1_KIDA7_471_01DY_20180901_000_000.csv";

    public static void main(String[] args)  throws  Exception{
        CSVUtil CSVUtil = new CSVUtil();
        CSVUtil.readCsv(FILE);

    }


    public void readCsv(String fileName) {
        BufferedReader reader = null;
        String line = "";
        String csvSplit = "\\|,\\|";//以|,|为分隔符进行解析

        try {
            reader = new BufferedReader(new FileReader(fileName));
            while((line = reader.readLine()) != null) {
                String[] rcd = line.split(csvSplit);
                for(int i = 0; i < rcd.length; i++) {
                    System.out.print(rcd[i]+ " ");

                    //相关方法保存进数据库
                }
                System.out.println("");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
