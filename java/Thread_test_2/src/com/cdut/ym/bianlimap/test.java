package com.cdut.ym.bianlimap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: ym
 * @Date: 2019/10/7 13:21
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 2);
        map.put(2, 3);


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + "," + map.get(key));
        }
        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> entry=iterator.next();
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
