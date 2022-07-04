package com.raptor.springmini.dao;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 陈文豪(chenwenhao.0401 @ bytedance.com)
 * @version 1.0
 * @date 2022/6/17 15:58
 * @description
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "raptor");
        hashMap.put("10002", "八杯水");
        hashMap.put("10003", "spring2.xml");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }



}