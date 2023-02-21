package com.myjava;
class Student1 {
    String name;
    int age;
    public void studentInfo(String name){
        System.out.println(name);
    }
    public void studentInfo(int age){
        System.out.println(age);
    }
    public void studentInfo(String name,int age){
        System.out.println(name+" "+age);

    }

}

public class polymorphism {
    //work done by different process is call polymorphism
    //there are two type of polymorphism
    //1.compili time polymorphism(function over loading )
    //2.run time ploymorphism---->use in inharitance
    public static void main(String[] args) {
        Student1 s=new Student1();
        s.name="abhijit";
        s.age=19;
        s.studentInfo(s.age);
        s.studentInfo(s.name,s.age);
    }





}
