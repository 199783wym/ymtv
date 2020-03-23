package com.cdut.ym.jiecheng;

/**
 * @Author: ym
 * @Date: 2019/10/7 21:25
 * @Version 1.0
 */
public class test {


        private static double[] f = new double[2];

        public static void main(String args[]) {

            String str = null;

            System.out.println(str);
    }

}
class Child extends Base{
    public void test(){
        System.out.println("child test");
    }

}
abstract class Base{
    public void test(){
        System.out.println("base test");
    }
}
interface a{
    public  void  ss();

}