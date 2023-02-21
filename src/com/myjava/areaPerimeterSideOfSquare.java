package com.myjava;
class square{
    int side,area,perimeter;
    square(int side){
        this.side=side;
        this.area=side*side;
        this.perimeter=4*side;
    }

    public int getArea(){
        return this.area;
    }
    public int getPerimeter(){
        return this.perimeter;
    }
}
public class areaPerimeterSideOfSquare {
    public static void main(String[] args) {
        square sq=new square(4);
        System.out.println("area :"+ sq.getArea());
        System.out.println("perimeter :"+sq.getPerimeter());
    }
}
