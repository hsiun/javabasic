package com.gaospot.collectsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-05-20 15:06
 */

public class PersonSort {

    public static void main(String[] args) {
        List<Person> plist = new ArrayList<>();
        Person p1 = new Person("001", "zhangsan", 32);
        Person p2 = new Person("002", "lisi", 20);
        Person p3 = new Person("003", "wangwu", 25);

        plist.add(p1);
        plist.add(p2);
        plist.add(p3);
        for (Person p : plist) {
            System.out.println("p = " + p.toString());
        }
        Collections.sort(plist, new Comparator<Person>() {
            /*
             * int compare(Person p1, Person p2) 返回一个基本类型的整型，
             * 返回负数表示：p1 小于p2，
             * 返回0 表示：p1和p2相等，
             * 返回正数表示：p1大于p2
             */
            @Override
            public int compare(Person p1, Person p2) {
                //按照Person的年龄进行升序排列
                if (p1.getAge() > p2.getAge()) {
                    return 1;
                }
                if (p1.getAge() == p2.getAge()) {
                    return 0;
                }
                return -1;
            }
        });

        for (Person p : plist) {
            System.out.println("p = " + p.toString());
        }
    }
}
