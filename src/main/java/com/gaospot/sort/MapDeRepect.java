package com.gaospot.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-07-12 11:09
 */

public class MapDeRepect {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("COL0", "");
        map1.put("COL1", "11");
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("COL0", "");
        map2.put("COL1", "11");
        Map<String, Object> map3 = new HashMap<String, Object>();
        map3.put("COL0", "");
        map3.put("COL1", "111");
        Map<String, Object> map4 = new HashMap<String, Object>();
        map4.put("COL0", "4");
        map4.put("COL1", "44");
        Map<String, Object> map5 = new HashMap<String, Object>();
        map5.put("COL0", "5");
        map5.put("COL1", "55");
        Map<String, Object> map6 = new HashMap<String, Object>();

        map6.put("COL0", "5");
        map6.put("COL1", "55");
        Map<String, Object> map7 = new HashMap<String, Object>();
        map7.put("COL0", "6f");
        map7.put("COL1", "66");
        Map<String, Object> map8 = new HashMap<String, Object>();
        map8.put("COL0", "6f");
        map8.put("COL1", "66");
        Map<String, Object> map9 = new HashMap<String, Object>();
        map9.put("COL0", "8");
        map9.put("COL1", "f1");

        list.add(map1);
        list.add(map3);
        list.add(map2);
        list.add(map4);
        list.add(map5);
        list.add(map6);
        list.add(map7);
        list.add(map8);
        list.add(map9);

        for (int i = 0; i < list.size(); i++) {
            Map m1 = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                Map m2 = list.get(j);
                if (m1.equals(m2)) {
                    list.remove(j);
                    continue;
                }
            }
        }

    }
}
