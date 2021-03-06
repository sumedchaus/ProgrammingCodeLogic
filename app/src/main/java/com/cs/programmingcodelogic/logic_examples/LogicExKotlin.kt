package com.cs.programmingcodelogic.logic_examples

class LogicExKotlin {

    fun largestNumber() {
        val num1 = 20
        val num2 = 40
        val num3 = 10
        if (num1 > num2 && num1 > num3) {
            println("$num1 num1 number is greater")
        } else if (num2 > num3) {
            println("$num2 num2 number is greater")
        } else {
            println("$num3 num3 number is greater")
        }
    }

    fun checkEvenOdd() {
        var number = 13
        if (number % 2 == 0) {
            println("$number is even")
        } else {
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

        a = a + b
        b = a - b
        a = a - b
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
    fun factorialRecursion(number: Int) {
        if (number >= 1) {
            fact_number = fact_number * number
            factorialRecursion(number - 1)
        }
    }

    fun reverseString() {
        val name = "Sumed"
        var reverseName = ""
        for (i in (name.length - 1) downTo 0) {
            reverseName = reverseName + name[i]
        }
        println(reverseName)
    }

    fun primeNumber() {
        val number = 13
        var flag = false
        for (i in 2 until number) {
            if (number % i == 0) {
                flag = true
                break
            }
        }
        if (flag == true) {
            println("$number number is not Prime")
        } else {
            println("$number number is Prime")
        }
    }

    fun primeNumberUpto100() {
        var temp = 0
        for (i in 1..100) {
            temp = 0
            for (j in 2..(i - 1)) {
                if (i % j == 0) {
                    temp = temp + 1
                }
            }
            if (temp == 0) {
                println(i)
            }

        }
    }

    fun fibonacciSeriesExample() {
        var num1 = 0
        var num2 = 1
        var num3: Int
        val fibonacciNumber = 10
        print("$num1 $num2")
        for (i in 1..fibonacciNumber) {
            num3 = num1 + num2
            print(" $num3")
            num1 = num2
            num2 = num3
        }
    }

    fun palindromeNumber() {
        var number = 444
        val palindromeNumber = number
        var reverse_number = 0
        var remain = 0
        while (number != 0) {
            remain = number % 10
            reverse_number = reverse_number * 10 + remain
            number = number / 10
        }
        if (palindromeNumber == reverse_number) {
            println("it is palindrome Number")
        } else {
            println("it's not palindrome Number")
        }
    }

    fun plusAllExample() {
        var plusAll = 0
        val number = 5
        for (i in 1..number) {
            plusAll = plusAll + i
        }
        println(plusAll)
    }

    fun additionOfNumberExample() {
        println("input for add number")
        var number = 456
        var addition = 0
        for (i in number downTo 1) {
            var digit = number % 10
            addition = addition + digit
            number = number / 10
        }
        println("$addition")
    }
}



fun main() {
    var logicEx = LogicExKotlin()

    logicEx.largestNumber()
//    logicEx.checkEvenOdd()
//    logicEx.leapYearExample()
//    logicEx.swapNumber()
//    logicEx.swapNumber2()
//    logicEx.multiplicationTable()
//    logicEx.factorialNumber()
//    logicEx.factorialNumber2()

//    logicEx.factorialRecursion(5)
//    println(logicEx.fact_number)

//    logicEx.reverseString()
//    logicEx.primeNumber()
//    logicEx.primeNumberUpto100()
//    logicEx.fibonacciSeriesExample()
//    logicEx.palindromeNumber()
//    logicEx.plusAllExample()
//    logicEx.additionOfNumberExample()

}
