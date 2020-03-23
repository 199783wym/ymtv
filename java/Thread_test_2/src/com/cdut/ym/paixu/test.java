package com.cdut.ym.paixu;

/**
 * @Author: ym
 * @Date: 2019/10/5 16:07
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
          int[] a=new int[20000];
          int[] b=new int[10];
          prob(b);
          pro(a);
        long startTime = System.currentTimeMillis(); //获取开始时间

//        maopao(a);
//        exchange(a);
//          select(a);
//        insert(a);
        shell(a);
        long endTime = System.currentTimeMillis(); //获取结束时间

        out(a);
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");


    }

    private static void shell(int[] a) {
       int gap=1;
       while(gap<a.length){
           gap=gap*3+1;//根据*3+1 设置间隙
       }
       while(gap>0){
           for(int i=gap;i<a.length;i++){
              int tem=a[i];
              int j=i-gap;
              while(j>=0 && a[j]>tem ){
                  a[j+gap]=a[j];
                  j-=gap;
              }
              a[j+gap]=tem;
           }
           gap=(gap/3);
       }


    }

    private static void insert(int[] a) {
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int tem= a[j];
                    a[j]=a[j-1];
                    a[j-1]=tem;
                }

            }
        }
    }

    private static  void select(int[] a){
        for (int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(i!=min){
                int tem=a[i];
                a[i]=a[min];
                a[min]=tem;
            }
        }
    }

    private static void exchange(int[] a) {
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int tem= a[j];
                    a[j]=a[i];
                    a[i]=tem;
                }
            }
        }
    }

    private static void maopao(int[] a) {
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int tem=a[j+1];
                    a[j+1]=a[j];
                    a[j]=tem;
                }
            }
        }
    }

    public static void pro (int[] a){
        for(int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*10000);
        }
    }
    public static void prob (int[] a){
        for(int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
        }
    }


    public static void out(int[] a){
        for(int index:a){
            System.out.print(index+" ");
        }
    }

}
