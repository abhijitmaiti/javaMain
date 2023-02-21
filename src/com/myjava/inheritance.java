package com.myjava;
abstract  class shape{
    static int l,b,h;
    public void getter(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    shape() {
        System.out.println("area of shape");
    }



}
class rectangle extends shape{
    public void area(){
        System.out.println(this.l*this.b);
    }

}
class triangle extends shape{
    public void area(){
        System.out.println(0.5*this.l*this.h);
    }
}
public class inheritance {
    public static void main(String args[]){

        triangle t=new triangle();
        rectangle r=new rectangle();
        t.getter(2,3,5);
        t.area();
        r.area();
    }
}
