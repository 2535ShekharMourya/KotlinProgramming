package BasicKotlinConcepts


fun main(){
    //The for loop is used to iterate over ranges or collections.
    for (i in 1..5) {
        print("$i ")
    }
    println()
    for (i in 1 until 5) {
        print(i)
    }
    println()
    for (i in 1..10 step 2) {// step 2 means counter move 2times once
        print(i)
    }
    println()
    for (i in 10 downTo 1 step 2) { // downTo means iterate in reverse order with step 2
        print(i)
    }
//You can also iterate over collections:
    val names = listOf("Alice", "Bob", "Charlie")
    for (name in names) {
        print("$name ")
    }
    println()
//The while loop repeatedly executes a block of code as long as a given condition is true.
    var x = 0
    while (x < 5) {
        print(x)
        x++
    }
    println()
//The do-while loop is similar to the while loop, but it ensures that the block of code is executed at least once, as the condition is checked after the loop body.
    var y = 0
    do {
        print(y)
        y++
    } while (y < 5)
    println()
//Kotlin provides the forEach function for iterating over elements in a collection.
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach {
        print(it)
    }
    println()
    //The repeat function allows you to execute a block of code a specific number of times.
    repeat(3) {
        print("Hello, Kotlin!")
    }





}