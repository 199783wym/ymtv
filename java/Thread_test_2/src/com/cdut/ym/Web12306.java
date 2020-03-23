package com.cdut.ym;

/**
 * @Author: ym
 * @Date: 2019/6/30 15:00
 * @Version 1.0
 */
public class Web12306 implements Runnable {

    private int ticketNums =99;
    @Override
    public void run() {
        while(true){
            if(ticketNums<0) {
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
        }

    }

    public static void main(String[] args) {
        Web12306 web =new Web12306();

        new Thread(web,"ym").start();
        new Thread(web,"ymm").start();
        new Thread(web,"ymmm").start();
    }
}
