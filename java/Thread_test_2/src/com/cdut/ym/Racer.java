package com.cdut.ym;

/**
 * @Author: ym
 * @Date: 2019/6/30 15:14
 * @Version 1.0
 */
public class Racer implements  Runnable {
    private String winner;
    @Override
    public void run() {
        for (int steps=1;steps<=100; steps++ ){
            System.out.println(Thread.currentThread().getName()+"-->"+steps);
            boolean flag=gameOver(steps);
            if(flag){
                break;
            }
        }

    }

    private boolean gameOver(int steps){
        if(winner!=null){
            return true;
        }
        else{
            if(steps ==100){

                if (Thread.currentThread().getName().equals("兔兔") && steps%10==0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                winner =Thread.currentThread().getName();
                System.out.println("胜利者"+winner);
                return true;

            }
        }
        return false;
    }

    public static void main(String[] args) {
        Racer racer = new Racer();
        new Thread(racer,"龟龟").start();
        new Thread(racer,"兔兔").start();

    }
}
