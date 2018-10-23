package com.gaospot.utils;

import org.apache.log4j.Logger;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 * 使用dom4j实现的xml解析的工具类
 * Created by gao on 2018/10/10.
 */
public class XMLUtil {
    private static Logger logger = Logger.getLogger(XMLUtil.class);

    /**
     * 根据传入的文件名解析XML文件
     * @param fileName
     */
    public void parserXML(String fileName) {
        SAXReader saxReader = new SAXReader();
        File XMLFile = new File(fileName);
        try {
            Document document = saxReader.read(XMLFile);
            Element root = document.getRootElement();
            List<Element> rcdElement = root.elements("rcd");

            for (Element rcd:rcdElement) {
                System.out.println("subkpiname=" + rcd.elementTextTrim("subkpiname"));
            }

        }catch (DocumentException e) {
            logger.error("error", e);
        }
    }

    /**
     * 从传入的length开始遍历XML文档，length大小从0开始计数
     * @param fileNmae
     * @param length
     * @return
     */
    public int parserXML(String fileNmae, int length) {
        int size = 0;
        SAXReader saxReader = new SAXReader();
        File XMLFile = new File(fileNmae);
        try{
            Document document = saxReader.read(XMLFile);
            Element root = document.getRootElement();
            List<Element> rcdElement = root.elements("rcd");
            size = rcdElement.size();

            if(length > size) {
                logger.error("开始位置不能大于文件记录数");
            }else {
                for (int i = length; i < size; i++) {
                    System.out.println(rcdElement.get(i).elementTextTrim("subkpiname"));

                }
            }
        }catch (DocumentException e) {
            logger.error("error", e);
        }
        return size;
    }

    public static void main(String[] args) throws InterruptedException {
        XMLUtil xmlUtil = new XMLUtil();
        //xmlUtil.parserXML("/Users/gao/2018-09-28.xml");
        int size = xmlUtil.parserXML("/Users/gao/test.xml", 0);
        sleep(30000);
        xmlUtil.parserXML("/Users/gao/test.xml", size);

    }
}