package com.myjava;
class emp{
    int salary;
    String name;
    public int getSalary( ){
        return this.salary;
    }
//    public void setSalary(int salary){
//        this.salary=salary;
//    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}
public class empClass {
    public static void main(String[] args) {
        emp e=new emp();
        e.salary=10000;
        System.out.println("Salary :"+e.getSalary());
        e.setName("ram");
        System.out.println("Name of emp :"+e.getName());
    }
}
