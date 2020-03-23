package com.cdut.ym.Lambda;

/**
 * @Author: ym
 * @Date: 2019/7/31 11:03
 * @Version 1.0
 */
public class test0731 {
    public static void main(String[] args) {
//        inter test2 =(a)->{return  a*a;};
//        inter test3 =a->a*a;
//        System.out.println(test2.compare(8));
//        System.out.println(test3.compare(9));
        inter test4 =a->change(a);
        System.out.println(test4.compare(10));
        inter test5 = test0731::change;
        System.out.println(test5.compare(11));

    }
    static int change(int a){
        return a*a;
    }


}


class a extends abs{


    @Override
    public void add(int a, int b) {

    }
}
interface  inter {
    public int compare(int a);
}

abstract class abs{
    public abstract void add(int a ,int b);
    public double   min(int a, int b){
        return (double)a-b;
    }
}




