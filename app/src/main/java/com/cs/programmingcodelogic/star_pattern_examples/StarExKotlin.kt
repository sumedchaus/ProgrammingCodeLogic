package com.cs.programmingcodelogic.star_pattern_examples

class StarExKotlin {

    /** E.x.
    //     *
    //     * *
    //     * * *
    //     * * * *
    //     * * * * *
     */
    fun starExample1() {
        for (i in 1..4) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }

    /** E.x.
    //     * * * * *
    //     * * * *
    //     * * *
    //     * *
    //     *

     */
    fun starExample2() {
        for (i in 1..4) {
            for (j in 4 downTo i) {
                print("*")
            }
            println()
        }
    }

    /** E.x.
    //     *
    //     * *
    //     * * *
    //     * * * *
    //     * * * * *
    //     * * * *
    //     * * *
    //     * *
    //     *
     */
    fun starExample3() {
        for (i in 1..4) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
        for (i in 1..3) {
            for (j in 3 downTo i) {
                print("*")
            }
            println()
        }
    }

    /**
     * E.x.
    //           *
    //         * *
    //       * * *
    //     * * * *
     */

    fun starExample4() {
        for (i in 1..4) {
            for (j in 3 downTo i) {
                print(" ")
            }
            for (k in 1..i) {
                print("*")
            }
            println()
        }
    }

    /**
     * E.x.
    //     * * * *
    //       * * *
    //         * *
    //           *
     */


    fun starExample5() {
        for (i in 1..4) {
            for (j in 1..i) {
                print(" ")
            }
            for (k in 4 downTo i) {
                print("*")
            }
            println()
        }
    }


    /**
     * E.x.
    //           *
    //         * *
    //       * * *
    //     * * * *
    //       * * *
    //         * *
    //           *

     */

    fun starExample6() {
        for (i in 1..4) {
            for (j in 3 downTo i) {
                print(" ")
            }
            for (k in 1..i) {
                print("*")
            }
            println()
        }
        for (i in 1..3) {
            for (j in 1..i) {
                print(" ")
            }
            for (k in 3 downTo i) {
                print("*")
            }
            println()
        }
    }

    /**
    //           *
    //          * *
    //         * * *
    //        * * * *
    //       * * * * *
     */

    fun starExample7() {
        for (i in 1..5) {
            for (j in 4 downTo i) {
                print(" ")
            }
            for (k in 1..i) {
                print(" *")
            }
            println()
        }
    }

    /**
    //           *
    //         * * *
    //       * * * * *
    //     * * * * * * *
    //   * * * * * * * * *
     */

    fun starExample8() {
        for (i in 1..5) {
            for (j in 5 downTo i) {
                print(" ")
            }
            for (k in 1..i) {
                print("*")
            }
            for (l in 2..i) {
                print("*")
            }
            println()
        }
    }

    /**
    //   * * * * * * * * *
    //     * * * * * * *
    //       * * * * *
    //         * * *
    //           *
     */


    fun starExample9() {
        for (i in 1..4) {
            for (j in 1..i) {
                print(" ")
            }
            for (k in 4 downTo i) {
                print("*")
            }
            for (l in 3 downTo i) {
                print("*")
            }
            println()
        }
    }

}

fun main() {
    var star = StarExKotlin()

//    star.starExample1()
//    star.starExample2()
//    star.starExample3()
//    star.starExample4()
//    star.starExample5()
//    star.starExample6()
//    star.starExample7()
//    star.starExample8()
    star.starExample9()
}