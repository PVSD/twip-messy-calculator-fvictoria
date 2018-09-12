package com.company;
import java.lang.Math.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner kbReader  = new Scanner(System.in);
        System.out.println("Enter first number");
        String firstNumber = kbReader.nextLine();
        int newFirstNumber = Integer.parseInt(firstNumber);
        System.out.println("Enter second number");
        String secondNumber = kbReader.nextLine();
        int newSecondNumber = Integer.parseInt(secondNumber);
        System.out.println("What would you like to do? add, subtract, multiply, or divide");
        String operation = kbReader.nextLine();
        if (operation.equals("add")) {
            double resultOne = Math.sqrt(newFirstNumber+newSecondNumber);
            System.out.println("The sum of " +newFirstNumber + " and " +newSecondNumber+" is " +resultOne +" are you satisfied?");
            String satisfaction = kbReader.nextLine();
            System.out.println("Can you identify what math class method I ran the real answer through?");
            String mClass = kbReader.nextLine();
            if (mClass.equals("sqrt")) {
                System.out.println("Correct");
            }
        }
        if (operation.equals("subtract")) {
            double resultTwo = Math.pow(newFirstNumber,newSecondNumber);
            System.out.println(resultTwo);
        }
        if (operation.equals("multiply")) {
            double resultThree = newFirstNumber + newSecondNumber;
            System.out.println(resultThree);
        }
        if (operation.equals("divide")) {
            double resultFour = newFirstNumber*newSecondNumber;
            System.out.println(resultFour);
        }






    }
}
