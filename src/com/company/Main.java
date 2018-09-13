package com.company;
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
            String s2 = kbReader.nextLine();
            System.out.println("Can you identify what math class method I ran the real answer through?");
            String mClass = kbReader.nextLine();
            if (mClass.equals("sqrt")) {
                System.out.println("Correct");
            }
        }
        if (operation.equals("subtract")) {
            double resultTwo = Math.pow(newFirstNumber,newSecondNumber);
            System.out.println("The difference between "+ newFirstNumber+ " and " +newSecondNumber + " is "+resultTwo+ " are you satisfied?");
            String s3 = kbReader.nextLine();
            System.out.println("Can you identify what math class method I ran the real answer through?");
            String mClass2 = kbReader.nextLine();
            if (mClass2.equals("power")) {
                System.out.println("Correct"); }

        }
        if (operation.equals("multiply")) {
            double resultThree = newFirstNumber + newSecondNumber;
            System.out.println("The product of "+ newFirstNumber+" and "+ newSecondNumber+" is "+resultThree+" are you satisfied?");
            String s4 = kbReader.nextLine();
            System.out.println("Can you identify what math class method I ran the real answer through?");
            String mClass3 = kbReader.nextLine();
            if (mClass3.equals("add")) {
                System.out.println("Correct");
            }

        }
        if (operation.equals("divide")) {
            double resultFour = newFirstNumber * newSecondNumber;
            System.out.println("The quotient of "+ newFirstNumber+" and "+newSecondNumber+" is "+resultFour+" are you satisfied?");
            String s5 = kbReader.nextLine();
            System.out.println("Can you identify what math class method I ran the real answer through?");
            String mClass4 = kbReader.nextLine();
            if (mClass4.equals("multiply")) {
                System.out.println("Correct");
            }

        }






    }
}
