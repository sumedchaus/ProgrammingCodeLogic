package com.cs.programmingcodelogic.numeric_pattern_example;

public class NeumericJava {

    /**
     * //     1
     * //     1 2
     * //     1 2 3
     * //     1 2 3 4
     */
    void neumericExample1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * //     1
     * //     2 2
     * //     3 3 3
     * //     4 4 4 4
     */
    void neumericExample2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /**
     * //     1
     * //     2 3
     * //     4 5 6
     * //     7 8 9 10
     */
    void neumericExample3() {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(" " + count);
            }
            System.out.println();
        }
    }

    /**
     * //  1
     * //  2 1
     * //  3 2 1
     * //  4 3 2 1
     */

    void neumericExample4() {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    /**
     * //  1
     * //  1 2 1
     * //  1 2 3 2 1
     * //  1 2 3 4 3 2 1
     * //  1 2 3 4 5 4 3 2 1
     */

    void neumericExample5() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    /**
     * //     * 5 4 3 2 1
     * //     * 5 4 3 2
     * //     * 5 4 3
     * //     * 5 4
     * //     * 5
     */
    void neumericExample6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    /**
     * //     1 2 3 4
     * //     1 2 3
     * //     1 2
     * //     1
     */
    void neumericExample7() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }


    /**
     * //      1
     * //      2 6
     * //      3 7 10
     * //      4 8 11 13
     * 5 9 12 14 15
     */
    void neumericExample8() {
        for (int i = 1; i <= 5; i++) {
            int number = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + number);
                number = number + 5 - j;
            }
            System.out.println();
        }
    }

    /**
     *  //  1   2   3
     *  //  4   5   6
     *  //  7   8   9
     *  //  10  11  12
     *  //  13  14  15
     */

    void neumericExample9() {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                count = count + 1;
                System.out.print(" " + count);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        NeumericJava neumeric = new NeumericJava();

//        neumeric.neumericExample1();
//        neumeric.neumericExample2();
//        neumeric.neumericExample3();
//        neumeric.neumericExample4();
//        neumeric.neumericExample5();
//        neumeric.neumericExample6();
//        neumeric.neumericExample7();
//        neumeric.neumericExample8();
        neumeric.neumericExample9();
    }
}
