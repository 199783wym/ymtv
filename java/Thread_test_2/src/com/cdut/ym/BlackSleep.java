package com.cdut.ym;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: ym
 * @Date: 2019/7/9 16:10
 * @Version 1.0
 */
public class BlackSleep {
    public static void main(String[] args) throws InterruptedException {
        Date endTime = new Date(System.currentTimeMillis() + 1000 * 10);
        long end =endTime.getTime();
        while(true){
            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
            Thread.sleep(1000);
            endTime = new Date(endTime.getTime()-1000);
            if(end-10000>endTime.getTime()){
                break;

            }
        }

    }
}
