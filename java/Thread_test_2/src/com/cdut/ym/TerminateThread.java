package com.cdut.ym;

/**
 * @Author: ym
 * @Date: 2019/6/30 16:55
 * @Version 1.0
 */
public class TerminateThread implements Runnable {
//标记
    private boolean flag =true;
    private String name;

    public TerminateThread(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        TerminateThread tt = new TerminateThread("Cristiano");
        new Thread(tt).start();

        for(int i=0;i<=99;i++){
            if(i==88){
                tt.terminnate();
                System.out.println("tt game over");
            }

            System.out.println("main-->"+i);
        }
    }
    @Override
    public void run() {
        int i=0;
        while(flag){
            System.out.println(name+"-->"+i++);
        }
    }

    public void terminnate(){
        this.flag =false;
    }
}
