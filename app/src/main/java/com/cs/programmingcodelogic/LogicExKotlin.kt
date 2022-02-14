package com.cs.programmingcodelogic

class LogicExKotlin {

    fun checkEvenOdd(){
        var number = 13
        if(number % 2 == 0){
            println("$number is even")
        }else{
            println("$number is odd")

        }
    }

    // leap year : condition  !)year needs to divide by 400  2) divide by 4 and should not divide by 100
    fun leapYearExample() {
        var year = 2024

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            print("it is a leap year")
        } else {
            print("it is not a leap year")

        }
    }

    fun swapNumber() { //swap 2 number using 3 var
        var a = 10
        var b = 20

        var c = a
        a = b
        b = c
        println("value of a is $a")
        println("value of b is $b")
    }


    fun swapNumber2() { //swap 2 number using 2 var
        var a = 80
        var b = 30

        a = a+b
        b = a-b
        a = a-b
        println("value of a is $a")
        println("value of b is $b")
    }

    fun multiplicationTable() {
        val num = 5
        for (i in 1..10) {
            print("  5 * $i =")
            println(num * i)
        }
    }

    //fact number of 5 = 1*2*3*4*5 = 120
    fun factorialNumber() {
        val number = 5
        var fact_number = 1
        for (i in 1..number) {
            fact_number = fact_number * i
        }
        println("factorial number of $number is $fact_number")
    }
    // or
    fun factorialNumber2() {
        val number = 5
        var fact_number = 1
        for (i in number downTo 1) {
            fact_number = fact_number * i
        }
        println("factorial number of $number is $fact_number")
    }

    var fact_number = 1
    fun factorialRecursion(number : Int){
        if(number >= 1){
            fact_number = fact_number * number
            factorialRecursion(number-1)
        }

    }

}

fun main() {
    var logicEx = LogicExKotlin()
    logicEx.checkEvenOdd()
//    logicEx.leapYearExample()
//    logicEx.swapNumber()
//    logicEx.swapNumber2()
//    logicEx.multiplicationTable()
//    logicEx.factorialNumber()
//    logicEx.factorialNumber2()
//    logicEx.factorialRecursion(5)
//    println(logicEx.fact_number)


}
