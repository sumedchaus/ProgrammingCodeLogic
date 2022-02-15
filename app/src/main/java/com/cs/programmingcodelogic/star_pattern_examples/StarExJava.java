package com.cs.programmingcodelogic.star_pattern_examples;

public class StarExJava {
    /**
     * E.x.
     * //     *
     * //     * *
     * //     * * *
     * //     * * * *
     * //     * * * * *
     */
    void starExample1() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * E.x.
     * //     * * * * *
     * //     * * * *
     * //     * * *
     * //     * *
     * //     *
     */
    void starExample2() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * E.x.
     * //     *
     * //     * *
     * //     * * *
     * //     * * * *
     * //     * * * * *
     * //     * * * *
     * //     * * *
     * //     * *
     * //     *
     */
    void starExample3() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * E.x.
     * //           *
     * //         * *
     * //       * * *
     * //     * * * *
     */

    void starExample4() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * E.x.
     * //     * * * *
     * //       * * *
     * //         * *
     * //           *
     */

    void starExample5() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * E.x.
     * //           *
     * //         * *
     * //       * * *
     * //     * * * *
     * //       * * *
     * //         * *
     * //           *
     */
    void starExample6() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 3; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * //           *
     * //          * *
     * //         * * *
     * //        * * * *
     * //       * * * * *
     */
    void starExample7() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    /**
     //           *
     //         * * *
     //       * * * * *
     //     * * * * * * *
     //   * * * * * * * * *
     */

    void starExample8() {
        for (int i = 1; i<= 5; i++){
            for (int j =5; j>= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++ ){
                System.out.print("*");
            }
            for (int l = 2; l<= i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     //   * * * * * * * * *
     //     * * * * * * *
     //       * * * * *
     //         * * *
     //           *
     */

    void starExample9() {
        for (int i = 1; i<= 5; i++){
            for (int j =1; j<= i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >=i; k-- ){
                System.out.print("*");
            }
            for (int l = 4; l>= i; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        StarExJava star = new StarExJava();

//        star.starExample1();
//        star.starExample2();
//        star.starExample3();
//        star.starExample4();
//        star.starExample5();
//        star.starExample6();
//        star.starExample7();
//        star.starExample8();
        star.starExample9();
    }

}
