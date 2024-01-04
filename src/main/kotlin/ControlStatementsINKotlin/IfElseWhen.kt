package ControlStatementsINKotlin

class IfElseWhen {
}
    fun  main(){
        val number = 10

        if (number > 0) {
            println("Number is positive")
        } else {
            println("Number is non-positive")
        }
        println()


            val number1 = 5
            val result = if (number1 % 2 == 0) {
                "Number is even"
            } else {
                "Number is odd"
            }
            println(result)
        println()

        val score = 75
        if (score >= 90) {
            println("Excellent")
        } else if (score >= 80) {
            println("Good")
        } else if (score >= 70) {
            println("Average")
        } else {
            println("Below Average")
        }
        println()

        /*when (variable) {
            value1 -> // Code to execute when variable equals value1
                value2 -> // Code to execute when variable equals value2
            else -> // Code to execute when variable doesn't match any of the specified values
        }*/
        describeNumber(5)
        val Result:String= isEvenOrOdd(5)
        println(Result)

    }
fun describeNumber(number: Int) {
    when (number) {
        0 -> println("Zero")
        1, 2 -> println("Small")
        in 3..10 -> println("Medium")
        else -> println("Large")
    }
}

fun isEvenOrOdd(number: Int): String {
    return when {
        number % 2 == 0 -> "Even"
        else -> "Odd"
    }
}