package com.cdut.ym.Lambda.exercise;

import com.cdut.ym.Lambda.Person;

import java.util.TreeSet;

/**
 * @Author: ym
 * @Date: 2019/8/2 15:46
 * @Version 1.0
 */
public class Exercise2 {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>((o1,o2)->o2.age-o1.age);
        set.add(new Person("王彦铭",18));
        set.add(new Person("谢家亮",25));
        set.add(new Person("王可欣",48));
        set.add(new Person("陆岩",46));
        set.add(new Person("李文硕",23));
        set.add(new Person("笨笨",2));
        set.add(new Person("虎虎",6));

        System.out.println(set);
    }
}
