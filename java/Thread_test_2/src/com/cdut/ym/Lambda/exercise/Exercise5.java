package com.cdut.ym.Lambda.exercise;

/**
 * @Author: ym
 * @Date: 2019/8/2 16:28
 * @Version 1.0
 */
public class Exercise5 {
    public static void main(String[] args) {
        //开辟线程 数字输出
        Thread t = new Thread(()->{
            for (int i =0;i<100;i++){
                System.out.println(i);
            }
        });
        t.start();
    }
}
