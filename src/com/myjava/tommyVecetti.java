package com.myjava;
class rockstar{
    rockstar(){
        hiting();
        firing();
        running();
    }
    public void hiting(){
        System.out.println("hiting.....");
    }
    public void running(){
        System.out.println("running.....");
    }
    public void firing(){
        System.out.println("firing......");
    }

}
public class tommyVecetti {
    public static void main(String[] args) {
        rockstar rks=new rockstar();

    }
}
