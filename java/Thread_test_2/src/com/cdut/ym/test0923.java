package com.cdut.ym;

/**
 * @Author: ym
 * @Date: 2019/9/23 15:36
 * @Version 1.0
 */
public class test0923 {
    public static void main(String[] args) {
      int num=1;
        System.out.println(test(num++));
    }

    private static int test(int b) {
        try{
            b+=1;
            if(--b>=3)
                ++b;
            return b;
        }catch (RuntimeException e){

        }catch (Exception e2){

        }finally {
            b++;
            return b--;
        }
    }
}

