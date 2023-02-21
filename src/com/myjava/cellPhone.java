package com.myjava;
class phone{
    public void method1(){
        System.out.println("Ringing......");
    }
    public void method2(){
        System.out.println("Vibrating......");
    }
}
public class cellPhone {
    public static void main(String[] args) {
        phone p=new phone();
        p.method1();
        p.method2();
    }
}
