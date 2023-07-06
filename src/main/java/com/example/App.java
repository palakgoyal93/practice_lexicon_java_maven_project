package com.example;


import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        System.out.println("Welcome to the simple calculator application");
        System.out.println("Follow the steps to use it.");

        double number1, number2, result;

        // create an object of scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        char operator;
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();


        switch (operator) {

            // performs addition between numbers
            case '+'->{
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
            }

            // performs subtraction between numbers
            case '-'->{
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
            }

            // performs multiplication between numbers
            case '*'->{
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);


            }

            // performs division between numbers
            case '/'->{
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
            }

        }

        System.out.println("Do you want to continue ? \nPress y to continue else press n to exit");
        char answer;
        answer=input.next().charAt(0);
        if (answer=='y'){
            main(new String[]{});
        }else {
            input.close();
        }
    }

    /*private static void calculate(){
        System.out.println("Welcome to the simple calculator application");
        System.out.println("Follow the steps to use it.");

        double number1, number2, result;

        // create an object of scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        char operator;
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();


        switch (operator) {

            // performs addition between numbers
            case '+'->{
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
            }

            // performs subtraction between numbers
            case '-'->{
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
            }

            case '*'->{
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);

                // performs division between numbers
            }

            case '/'->{
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
            }
            // performs multiplication between numbers
        }

        input.close();

        System.out.println("Do you want to continue ? \nPress y to continue else press n to exit");
        char answer;
        answer=input.next().charAt(0);
        if (answer=='y'){
            calculate();

        }

    }*/
}


