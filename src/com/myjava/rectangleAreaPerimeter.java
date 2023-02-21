package com.myjava;
class rect{
    int side1,side2,area,perimeter;
    rect(int side1,int side2){
        this.side1=side1;
        this.side2=side2;
        this.area=side1*side2;
        this.perimeter=2*(side1+side2);
    }

    public int getArea(){
        return this.area;
    }
    public int getPerimeter(){
        return this.perimeter;
    }
}
public class rectangleAreaPerimeter {
    public static void main(String[] args) {
        rect r=new rect(2,3);
        System.out.println("Area :"+r.getArea());
        System.out.println("Perimeter :"+r.getPerimeter());
    }
}
