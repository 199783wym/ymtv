package com.cdut.ym.tianyuan;

/**
 * @Author: ym
 * @Date: 2019/9/23 19:59
 * @Version 1.0
 */
class Cup {
}
class PosionCup extends Cup{
    public void takeCup(Cup c) {
        if(c instanceof  PosionCup){
            System.out.println("iii");
        }else if(c instanceof Cup) {
            System.out.println("dddd");
        }else {
            System.out.println("exit");
        }



    }
}
class TestCup{
    public static void main(String[] args) {
        Cup cup= new PosionCup();
        PosionCup poison= new PosionCup();
        poison.takeCup(cup);
    }
}
