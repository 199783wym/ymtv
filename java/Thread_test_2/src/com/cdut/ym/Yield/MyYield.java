package com.cdut.ym.Yield;

/**
 * @Author: ym
 * @Date: 2019/7/9 16:29
 * @Version 1.0
 */
public class MyYield implements Runnable {
    public static void main(String[] args) {
        MyYield my =new MyYield();
        new Thread(my,"a").start();
        new Thread(my,"b").start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->start");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"-->end");
    }
}
