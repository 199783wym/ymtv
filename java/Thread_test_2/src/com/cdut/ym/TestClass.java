package com.cdut.ym;

/**
 * @Author: ym
 * @Date: 2019/7/14 20:40
 * @Version 1.0
 */
public class TestClass {


    public static void main(String[] args) {
        car car1=new car("bmw");
        car car2=car1;
        System.out.println(car1.name );
        car2.name="byd";
        System.out.println(car1.name);
    }

}

class car{
    public car(String name) {
        this.name = name;
    }

    public String name;
}
