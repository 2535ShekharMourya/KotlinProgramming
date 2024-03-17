package lamdaExp

import kotlin.math.pow

/*
# Higher-order Function:->
1. Can accept another Function as parameter
2. Can return a function as a value
4. or can do both
5. Function that accepts functions as argument or return functions or both

#  Lambda Expression
1. it is just a function without a name also called anonymous functions
2. Lambda is a function which has no name. Lambda id defined with a curly braces {}
   which takes variable as a parameter (if any) and body of function.
   the body of function is written after variable (if any) followed by -> operator
* */
fun main() {
    val output=higherOrder(2.0,3.0,::sum)
    // or you can use lambda instead of creating new sum function separately
    val output2= higherOrder(2.0,3.0,{a:Double,b:Double->a+b})
    val output3= higherOrder(2.0,3.0) { a, b -> a + b }
    println("final output  $output")
    println("final output  $output2")
    println("final output  $output3")


    // Note: before the -> in lambda all are variables and after the -> in lambda  all body of function
    val myLambdaFunc: (Int, Int) -> Int = { x, y -> x + y }
    addTwoNum(3, 8, myLambdaFunc)// Passing Lambda to Higher-order Function
    println()
    // Note: we can store functions inside variable like storing values and objects in variables
    var fn: (a: Double, b: Double) -> Double = ::sum // we assign sum() function into fn variable and variable type is also a function
    var fn1: (a: Double, b: Double) -> Double = ::power
    println(fn(4.0, 6.0))
    calculator(4.0, 4.0, ::sum)
    /*
    1. in kotlin function also called first class citizen mean in kotlin functions are treated like objects or Normal values
       means for object, 'we can assign object inside a variable' 'pass object in functions' 'return object'
       similarly a function also can ' assign into a variable' 'pass function in function' 'return function in function'
    * */
    println(sum(2.0, 3.0))
    println(power(2.0, 3.0))

    // Lambda expression
    val lambda1: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    val multiLineLambda: () -> Int = {
        println("Hellow Lambda")
        val a = 3 + 2
        "hellow sir"
        2// last line of lambda expression consider as return value and return type should be same
    }
    println(multiLineLambda())
    val singleParamLambda={x:Int ->x*x}
    val lambda2:(Int)->Int={x->x*x}
    val sayHai={msg:String -> println("hellow $msg") }
    val sayHai2:(String)->Unit={msg -> println("hellow $msg") }

    val singleParam:(Int)->Int={x->x+x}
    val simplifySingleParam:(Int)->Int={it + it} // both same if single parameter then use it instead of x or y
    calculator(1.0,2.0) { a, b -> a + b } // this lambda is my last argument or last parameter

    /*
     normal function
    fun sum(a: Double, b: Double): Double {
    return a + b
         }
         convert this into lambda
         val sum={a:Double, b:Double -> a+b}
    * */


}

fun higherOrder(a:Double,b:Double,fn:(Double,Double)->Double):Double{
    println(fn(a,b))
    return fn (a,b)
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun power(a: Double, b: Double): Double {
    return a.pow(b)
}

fun addTwoNum(i: Int, i1: Int, myFunc: (Int, Int) -> Int) {
    var result = myFunc(i, i1) // x+y=i+i1=3+8=11
    println(result)

}

fun calculator(a: Double, b: Double, gn: (Double, Double) -> Double) {
    val result = gn(a, b)
    println(result)
}
