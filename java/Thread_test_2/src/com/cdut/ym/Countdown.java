package com.cdut.ym;

/**
 * @Author: ym
 * @Date: 2019/6/30 17:14
 * @Version 1.0
 */
public class Countdown implements Runnable {
    int i;
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Countdown cd = new Countdown();
        new Thread(cd).start();
    }
}
