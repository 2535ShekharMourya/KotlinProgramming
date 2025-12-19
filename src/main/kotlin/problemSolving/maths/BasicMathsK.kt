package problemSolving.maths

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer


fun main(){
// this approach is faster than readLine method
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    println(a+b)

//    val input = readLine()!!.toInt()
//    for (i in 1..input){
//        val testInput = readLine()
//
//    }

}

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    if (n == 2) return true
    if (n % 2 == 0) return false

    var i = 3
    while (i * i <= n) {
        if (n % i == 0) return false
        i += 2
    }
    return true
}
