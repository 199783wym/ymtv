package com.cdut.ym.Lambda.exercise;

import com.cdut.ym.Lambda.Person;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @Author: ym
 * @Date: 2019/8/2 16:17
 * @Version 1.0
 */
public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Person> list =new ArrayList<>();
        list.add(new Person("王彦铭",18));
        list.add(new Person("谢家亮",25));
        list.add(new Person("王可欣",48));
        list.add(new Person("陆岩",46));
        list.add(new Person("李文硕",23));
        list.add(new Person("笨笨",2));
        list.add(new Person("虎虎",6));

        //删除集合中年龄>10岁的元素
        ListIterator<Person> it = list.listIterator();
//        while(it.hasNext()){
//            Person ele = it.next();
//            if(ele.age<10){
//                it.remove();
//            }
//        }
        list.removeIf(ele -> ele.age<10);

        System.out.println(list);
    }
}
