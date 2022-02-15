package com.cs.programmingcodelogic.logic_examples;

public class LogicExJava {


    void largestNumber() {
        int num1 = 20;
        int num2 = 40;
        int num3 = 10;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " num1 number is greater");
        } else if (num2 > num3) {
            System.out.println(num2 + " num2 number is greater");
        } else {
            System.out.println(num3 + " num3 number is greater");
        }
    }


    void checkEvenOdd() {
        int number = 7;
        if (number % 2 == 0) {
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

    void reverseNumber() {
        int number = 123456;
        int reverse_number = 0;
        int remain = 0;

        while (number != 0) {
            remain = number % 10;
            reverse_number = reverse_number * 10 + remain;
            number = number / 10;
        }
        System.out.println(reverse_number);
    }

    void reverseString() {
        String name = "Sumed";
        String reverseName = "";
        for (int i = (name.length() - 1); i >= 0; i--) {
            reverseName = reverseName + name.charAt(i);
        }
        System.out.println(reverseName);
    }

    void primeNumber() {
        int number = 7;
        boolean flag = false;
        for (int i = 2; i <= (number - 1); i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println(number + " number is not Prime");
        } else {
            System.out.println(number + " number is Prime");
        }
    }

    void primeNumberUpto100() {
        int temp = 0;
        for (int i = 1; i <= 100; i++) {
            temp = 0;
            for (int j = 2; j <= (i - 1); j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.println(i);
            }
        }
    }

    void fibonacciSeriesExample() {
        int num1 = 0;
        int num2 = 1;
        int num3;
        int fibonacciNumber = 10;
        System.out.print(num1 + " " + num2);

        for (int i = 1; i <= fibonacciNumber; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }

    void palindromeNumber() {
        int number = 152251;
        int palindromeNumber = number;
        int reverse_number = 0;
        int remain = 0;

        while (number != 0) {
            remain = number % 10;
            reverse_number = reverse_number * 10 + remain;
            number = number / 10;
        }
        if (palindromeNumber == reverse_number) {
            System.out.println("it is palindrome Number");
        } else {
            System.out.println("it's not palindrome Number");
        }
    }

    void plusAllExample() {
        int plusAll = 0;
        int number = 5;
        for (int i = 1; i <= number; i++) {
            plusAll = plusAll + i;
        }
        System.out.println(plusAll);
    }

    void additionNumber() {
        int number = 456;
        int digit = 0;
        int addition = 0;

        for (int i = number; i >= 0; i--) {
            digit = number % 10;
            addition = digit + addition;
            number = number / 10;
        }
        System.out.println(addition);
    }


    public static void main(String[] args) {
        LogicExJava logicExJava = new LogicExJava();

        logicExJava.largestNumber();
//        logicExJava.checkEvenOdd();
//        logicExJava.leapYearExample();
//        logicExJava.swapNumber();
//        logicExJava.swapNumber2();
//        logicExJava.multiplicationTable();
//    logicExJava.factorialNumber();
//    logicExJava.factorialNumber2();

//        logicExJava.factorialRecursion(5);
//        System.out.println(logicExJava.fact_number);

//        logicExJava.reverseNumber();
//        logicExJava.reverseString();
//        logicExJava.primeNumber();
//        logicExJava.primeNumberUpto100();
//        logicExJava.fibonacciSeriesExample();
//        logicExJava.palindromeNumber();
//        logicExJava.plusAllExample();
//        logicExJava.additionNumber();


    }
}
