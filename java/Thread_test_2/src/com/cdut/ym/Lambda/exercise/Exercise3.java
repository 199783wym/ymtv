package com.cdut.ym.Lambda.exercise;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: ym
 * @Date: 2019/8/2 15:53
 * @Version 1.0
 */
public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,0);

        list.forEach(System.out::println);

    }
}
