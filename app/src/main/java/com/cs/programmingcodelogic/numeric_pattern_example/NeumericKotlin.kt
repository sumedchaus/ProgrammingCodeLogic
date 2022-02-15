package com.cs.programmingcodelogic.numeric_pattern_example

class NeumericKotlin {
    /**
     * //     1
     * //     1 2
     * //     1 2 3
     * //     1 2 3 4
     */
    fun neumericExample1() {
        for (i in 1..5) {
            for (j in 1..i) {
                print(j)
            }
            println()
        }
    }


    /**
     * //     1
     * //     2 2
     * //     3 3 3
     * //     4 4 4 4
     */
    fun neumericExample2() {
        for (i in 1..5) {
            for (j in 1..i) {
                print(i)
            }
            println()
        }
    }


    /**
     * //     1
     * //     2 3
     * //     4 5 6
     * //     7 8 9 10
     */
    fun neumericExample3() {
        var count = 0
        for (i in 1..4) {
            for (j in 1..i) {
                count++
                print(" $count")
            }
            println()
        }
    }

    /**
     * //  1
     * //  2 1
     * //  3 2 1
     * //  4 3 2 1
     */
    fun neumericExample4() {
        for (i in 1..4) {
            for (j in i downTo 1) {
                print(" $j")
            }
            println()
        }
    }

    /**
     * //  1
     * //  1 2 1
     * //  1 2 3 2 1
     * //  1 2 3 4 3 2 1
     * //  1 2 3 4 5 4 3 2 1
     */
    fun neumericExample5() {
        for (i in 1..5) {
            for (j in 1..i) {
                print(" $j")
            }
            for (j in i - 1 downTo 1) {
                print(" $j")
            }
            println()
        }
    }

    /**
     * //     * 5 4 3 2 1
     * //     * 5 4 3 2
     * //     * 5 4 3
     * //     * 5 4
     * //     * 5
     */
    fun neumericExample6() {
        for (i in 1..5) {
            for (j in 5 downTo i) {
                print(" $j")
            }
            println()
        }
    }

    /**
     * //     1 2 3 4
     * //     1 2 3
     * //     1 2
     * //     1
     */

    fun neumericExample7() {
        for (i in 5 downTo 1) {
            for (j in 1..i) {
                print(" $j")
            }
            println()
        }
    }
    /**
     * //      1
     * //      2 6
     * //      3 7 10
     * //      4 8 11 13
     *         5 9 12 14 15
     */

    fun neumericExample8() {
        for (i in 1..5) {
            var number = i
            for (j in 1..i) {
                print(" $number")
                number = number + 5 - j
            }
            println()
        }
    }

    /**
     * //  1   2   3
     * //  4   5   6
     * //  7   8   9
     * //  10  11  12
     * //  13  14  15
     */
    fun neumericExample9() {
        var count = 0
        for (i in 1..5) {
            for (j in 1..3) {
                count = count + 1
                print(" $count")
            }
            println()
        }
    }


}

fun main() {
    var neumeric = NeumericKotlin()

//    neumeric.neumericExample1()
//    neumeric.neumericExample2()
//    neumeric.neumericExample3()
//    neumeric.neumericExample4()
//    neumeric.neumericExample5()
//    neumeric.neumericExample6()
    neumeric.neumericExample7()

}