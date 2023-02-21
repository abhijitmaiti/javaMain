package com.myjava;

import java.util.Random;
import java.util.*;

class game1{
    int userInput;
    int computerInput;
    game1(){
        System.out.println("0-->paper");
        System.out.println("1-->stone");
        System.out.println("2-->sesior");
        Random random=new Random();
        this.computerInput= random.nextInt(3);

    }
    public void setUserInput(int input){
        if(input>3){
            System.out.println("invalid input.....");
        }
        this.userInput=input;
    }

}
class gameLogic extends game1{
    public String logic(){
        String con="";
        if(computerInput==userInput){
            con= "draw";
        }
        else if(computerInput!=userInput){
            if(userInput==0 && computerInput==1 || userInput==1 && computerInput==2||userInput==2 && computerInput==0){
                con= "you win";

            }
            else
                con="computer win";

        }
        if(computerInput==0)
            System.out.println("Computer choise : paper");
        else if(computerInput==1)
            System.out.println("Computer choise : sesior");
        else if(computerInput==2)
            System.out.println("Computer choise : stone ");

        return con;
    }
}
public class stonePaperSesiorGame {
    public static void main(String[] args) {
        gameLogic g=new gameLogic();
        Scanner scan=new Scanner(System.in);
        System.out.print("user input :");

        g.setUserInput(scan.nextInt());
        System.out.println(g.logic());

    }
}
