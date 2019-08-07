package com.gaospot.sort;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Comparator;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-07-10 20:36
 */

public class JSONArraySort {

    public static void main(String[] args) {
        String arrayStr = "[{\"id\":\"CB_002\",\"moId\":\"abcdefg\",\"unit\":\"户\",\"cycle\":\"小时\",\"updatetime\":\"2019-06-27 15:52:29\",\"name\":\"首次发送停机指令的用户数\"},{\"id\":\"CB_002\",\"moId\":\"abcdefg\",\"unit\":\"元\",\"cycle\":\"小时\",\"updatetime\":\"2019-06-27 15:53:29\",\"name\":\"首次发送停机指令时刻用户欠费额\"}]";

        JSONArray jsonArray = JSONArray.parseArray(arrayStr);

        jsonArray.sort(Comparator.comparing(obj-> ((JSONObject) obj).getString("updatetime")).reversed());

        System.out.println(jsonArray);

    }
}
