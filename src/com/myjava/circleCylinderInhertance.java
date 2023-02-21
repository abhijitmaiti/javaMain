package com.myjava;
import java.util.Scanner;
class circle{
    int r,h;
    public void areaOfCircle(){
        System.out.println("area of cirlce : "+(3.14)*this.r*this.r);
    }
    public void volumeOfCircle(){
        System.out.println("volume of cirlce : "+(4/3)*(3.14)*this.r*this.r*this.r);
    }

}
class cylinder  extends circle{
    public void setrandh(int r,int h){
        this.r=r;
        this.h=h;
    }
    public void areaOfcylinder(){
        System.out.println("area of cylinder :"+2 *(3.14)*this.r*this.h+2*(3.14)*this.r*2);
    }
    public void volumnOfcylinder(){
        System.out.println("volumn of cylider :"+(3.14)*this.r*2*this.h);
    }


}
public class circleCylinderInhertance {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        cylinder c=new cylinder();
        System.out.println("Enter r and h");
        c.setrandh(scan.nextInt(), scan.nextInt());
        c.areaOfCircle();
        c.volumeOfCircle();
        c.areaOfcylinder();
        c.volumnOfcylinder();
    }
}
