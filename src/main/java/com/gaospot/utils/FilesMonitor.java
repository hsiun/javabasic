package com.ai.toptea.detail;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2018/12/14 11:31 AM
 * @description: 监控文件数目变动
 */


public class FilesMonitor implements Runnable {
    /**
     * 文件夹路径
     */
    private String filePath = "/Users/gao/test";
    /**
     * 存放已读文件<即：缓存目录>
     */
    private static Map<String, File> map = new HashMap<String, File>();


    @Override
    public void run() {
        while (true) {
            try {
                // 设置每隔3秒检测一次
                Thread.sleep(5000);
                FileMonitor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 文件监听
     */
    public void FileMonitor() {
        File[] files = getFiles(filePath, null);
        if (files != null && files.length > 0) {
            // 如果缓存中文件与读取的个数不一样的时候
            String fName = "";
            if (files.length != map.size()) {
                if (map.size() == 0) {
                    for (File file : files) {
                        fName = file.getName();
                        map.put(fName, file);
                        System.out.println("新增了文件：" + fName);
                    }
                } else {
                    // 如果减少了文件
                    if (map.size() > files.length) {
                        List<String> removeName = new ArrayList<String>();
                        Iterator<String> iter = map.keySet().iterator();
                        int j = 0;
                        while (iter.hasNext()) {
                            String key = iter.next();
                            if (key != null && key.length() > 0) {
                                for (File file : files) {
                                    fName = file.getName();
                                    if (fName.equals(key)) {
                                        j = 1;
                                        break;
                                    }
                                }
                                if (j != 1) {
                                    removeName.add(key);
                                }
                                j = 0;
                            }
                        }
                        // 判断是否有删除的文件
                        if (removeName.size() > 0) {
                            for (String item : removeName) {
                                map.remove(item);
                                System.out.println("减少了文件：" + item);
                            }
                        }
                    } else {
                        for (File file : files) {
                            fName = file.getName();
                            if (!map.containsKey(fName.trim())) {
                                map.put(fName, file);
                                System.out.println("新增了文件：" + fName);
                            }
                        }
                    }
                }
            } else {
                map.clear();
                for (File file : files) {
                    fName = file.getName();
                    map.put(fName, file);
                }
            }
            System.out.println("此时缓存中文件个数：" + map.size());
        }
    }


    /**
     * 文件读取
     *
     * @param filePath
     *      路径
     * @param fileName
     *      名称
     * @return 返回文件数组
     */
    public File[] getFiles(String filePath, String fileName) {
        File[] files = null;
        if (fileName == null) {
            File doc = new File(filePath);
            if (doc.isDirectory()) {
                String[] fileNameArr = doc.list();
                if (fileNameArr.length > 0) {
                    files = new File[fileNameArr.length];
                    for (int i = 0; i < fileNameArr.length; i++) {
                        fileName = fileNameArr[i];
                        String fileAbsPath = filePath + fileName;
                        File regInfoFile = new File(fileAbsPath);
                        files[i] = regInfoFile;
                    }
                }
            }
        } else {
            String path = filePath + fileName;
            File doc = new File(path);
            if (doc.isFile()) {
                files = new File[1];
                files[0] = doc;
            }
        }
        return files;
    }

    
    
    /**
     * 匹配规则为pattern且日期大于date的文件
     *
     * @param logLocation 需要匹配文件夹的路径
     * @param pattern     匹配模式
     * @param date        需要大于的日期
     * @return
     * @throws ParseException
     */
    public static String[] getCsvFiles(String logLocation, final String pattern, String date) throws ParseException {
        File logDirectory = new File(logLocation);
        String[] files = new String[]{};

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date d = f.parse(date);
        long milliseconds = d.getTime();


        if (logDirectory.isDirectory()) {
            files = logDirectory.list((x, y) -> y.matches(pattern) && new File(x, y).lastModified() >= milliseconds);
        }
        return files;
    }

    // 启动线程
    public void show() {
        FilesMonitor t = new FilesMonitor();
        Thread tread = new Thread(t);
        tread.setName("eshore");
        tread.start();
    }


    // Main测试
    public static void main(String[] args) {
        FilesMonitor t = new FilesMonitor();
        t.show();
    }
}
