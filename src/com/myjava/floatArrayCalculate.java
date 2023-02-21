package com.myjava;

import java.util.*;
public class floatArrayCalculate {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number :");
        int n=scan.nextInt();
        float a[]=new float[n];
        for(int i=0;i<n;i++){
            a[i]= scan.nextFloat()
            ;
        }

        float sum= 0.0F;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        System.out.println("sum o float array : "+sum);


    }
}
