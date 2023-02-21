package com.myjava;
class pen{
    String color;
    String type;
    public  void funForColor(){
        System.out.println(this.color);
    }
    public void funForType(){
        System.out.println(this.type);
    }
    pen(){
        System.out.println("constructor is called ");
    }

}
class Student{
    String name;
    int age;
    public void studentInfo(){
        System.out.println("name of student :"+this.name);
        System.out.print("age of student :"+this.age);


    }
    //constructor allways print first
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    //without parameter constructor
    //in java there is no disconstructor because java hava garbage collection
    Student(){

    }

}
public class oops {
    public static void main(String args[]){

        //copy constuctor

        Student s1=new Student();
        Student s2=new Student(s1);
        s1.name="abhijit";
        s1.age=19;
        s1.studentInfo();






//        pen pen1=new pen();
//        pen pen2=new pen();
//        pen1.color="blue";
//        pen2.color="black";
//        pen1.type="gel";
//        pen2.type="ballpoint";
//        pen1.funForColor();
//        pen2.funForColor();
//        pen1.funForType();
//        pen2.funForType();
//        pen pen1=new pen();
//        pen1.color="black";
//        pen1.type="gel";
//        pen1.funForColor();
//        pen1.funForType();




    }
}
