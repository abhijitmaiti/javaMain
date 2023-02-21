package com.myjava;

public class bubbleSort {
    public static void main(String args[]){
        int n=123;
        int temp=1;
        while (n>0){
            temp=(n%10);
            n=n/10;
        }
        System.out.println(temp);

    }
}
