package com.cdut.ym.test0922;

/**
 * @Author: ym
 * @Date: 2019/9/22 15:36
 * @Version 1.0
 */
public abstract class Parent {
    private int ym;
    private int pym;
    public Parent(int a){
        this.ym=a;
    }
    public Parent(int a,int b){
        this.ym=a;
        this.pym=b;
    }

    public int getYm() {
        return ym;
    }

    public void setYm(int ym) {
        this.ym = ym;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "ym=" + ym +
                ", pym=" + pym +
                '}';
    }
}
class Child extends Parent {
    private  int ymm;
    private  int ymmm;

    public Child(int a) {
        super(a);
    }
    public Child(int a, int b){
        super(a,b);
        this.ymm=a;
        this.ymmm=b;
    }

    @Override
    public String toString() {

        return super.toString()+"Child{" +
                "ymm=" + ymm +
                ", ymmm=" + ymmm +
                '}';
    }
}
class client{
    public static void main(String[] args) {
        Child c = new Child(1, 2);
        System.out.println(c.toString());
    }
}
