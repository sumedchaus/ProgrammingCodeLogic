package com.cs.programmingcodelogic;

public class LogicExJava {


    void checkEvenOdd() {
        int number = 7;
        if(number % 2 == 0){
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    void leapYearExample() {
        int year = 2024;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("it is a leap year");
        } else {
            System.out.println("it is not a leap year");
        }
    }

    void swapNumber() { //swap 2 number using 3 var
        int a = 10;
        int b = 20;

        int c = a;
        a = b;
        b = c;
        System.out.println("value of a is " + a);
        System.out.println("value of b is " + b);

    }

    void swapNumber2() { //swap 2 number using 2 var
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("value of a is " + a);
        System.out.println("value of b is " + b);
    }


    void multiplicationTable() {
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.print("  5 * " + i + (" ="));
            System.out.println(num * i);
        }
    }

    //fact number of 5 = 1*2*3*4*5 = 120
    void factorialNumber() {
        int number = 5;
        int fact_number = 1;
        for (int i = 1; i <= number; i++) {
            fact_number = fact_number * i;
        }
        System.out.println("factorial number of " + number + " is " + fact_number);
    }

    // or
    void factorialNumber2() {
        int number = 5;
        int fact_number = 1;
        for (int i = number; i >= 1; i--) {
            fact_number = fact_number * i;
        }
        System.out.println("factorial number of " + number + " is " + fact_number);
    }

    int fact_number = 1;

    int factorialRecursion(int number) {
        if (number > 1) {
            fact_number = fact_number * number;
            factorialRecursion(number - 1);
        }
        return fact_number;
    }


    public static void main(String[] args) {
        LogicExJava logicExJava = new LogicExJava();
        logicExJava.checkEvenOdd();
//        logicExJava.leapYearExample();
//        logicExJava.swapNumber();
//        logicExJava.swapNumber2();
//        logicExJava.multiplicationTable();
//    logicExJava.factorialNumber();
//    logicExJava.factorialNumber2();
//        logicExJava.factorialRecursion(5);
//        System.out.println(logicExJava.fact_number);

    }
}
