package CollectionsInKotlin

import kotlinx.coroutines.*


fun main()  = runBlocking {
    val numList = listOf<Int>(1,2,3,4,5,6,7,8,9)
    val oddNumList = numList.map { it -> it/5 }
    val num = numList.find { it%2==0 }
    println(num)
    println(numList.contains(4))
    repeat(2) { i ->
        println("Repeat $i: Hello Shekhar!")
    }

}

