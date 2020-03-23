package com.cdut.ym.Lambda.exercise;

import com.cdut.ym.Lambda.Person;

import java.util.ArrayList;

/**
 * @Author: ym
 * @Date: 2019/7/31 16:48
 * @Version 1.0
 */
public class Exercise1 {
    //集合排序：
    //ArrayList<>
    public static void main(String[] args) {
        //需求：已知在一个ArrayList中有若干个Person对象。将这些Person对象按照年龄进行降序排序
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("王彦铭",18));
        list.add(new Person("谢家亮",25));
        list.add(new Person("王可欣",48));
        list.add(new Person("陆岩",46));
        list.add(new Person("李文硕",23));
        list.add(new Person("笨笨",2));
        list.add(new Person("虎虎",6));
        list.sort((o1,o2)->o2.age-o1.age);
        System.out.println(list);
    }
}
