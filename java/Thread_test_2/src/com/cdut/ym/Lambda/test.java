package com.cdut.ym.Lambda;

/**
 * @Author: ym
 * @Date: 2019/7/31 16:24
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {

//        PersonCreater personCreater = () -> new Person();
          PersonCreater pc = Person::new;
          Person a = pc.getPerson();
          PersonCreater2 pc2 =Person::new;
          Person b = pc2.getPerson("WYM",666);

    }
}
interface PersonCreater{
    Person getPerson();
}
interface PersonCreater2{
    Person getPerson(String a,int b);
}
