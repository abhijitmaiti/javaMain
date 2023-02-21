package com.myjava;
import java.util.Random;
import java.util.Scanner;

class guessNumber{
    protected int userInput;
    protected int randomNumber;
    int noOfGuess=0;

     guessNumber(){
         Random random=new Random();
         randomNumber= random.nextInt(10);

    }
    public void setUserInput(int userInput){
         this.userInput=userInput;
    }
    public void setNoOfGuess(){
         this.noOfGuess++;
    }
    public void getNoOfGuess(){
        System.out.println("Number Of Guess :"+noOfGuess);
    }

}
class isCorrect extends guessNumber{


    public boolean gameLogic(){

        boolean isRight=false;
        if(randomNumber==userInput)
            isRight=true;
        else
            isRight=false;
        return isRight;


    }

}
public class guessTheNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        isCorrect obj=new isCorrect();
        while(true){
            System.out.print("User input :");
            obj.setUserInput(scan.nextInt());
            boolean ans= obj.gameLogic();
            if(ans==true){
                obj.setNoOfGuess();
                System.out.println("correct guess....");
                System.out.println("Number is --->"+obj.randomNumber);
                obj.getNoOfGuess();
                break;

            }

            else{
                obj.setNoOfGuess();
                System.out.println("worong guess....");
                System.out.println("Number is --->"+obj.randomNumber);}
                obj.getNoOfGuess();
        }
    }

}
