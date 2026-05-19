package OOpsInKotlin.Polimorphism

class Calculator {
    // Same method name, different parameters
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    fun add(a: String, b: String): String {
        return a + b
    }
    fun add(a: Int,b: Double): Double{
        return 3.4
    }
}

fun main() {
    val calc = Calculator()

    println(calc.add(5, 10))           // Output: 15 (Int version)
    println(calc.add(5.5, 10.5))       // Output: 16.0 (Double version)
    println(calc.add(5, 10, 15))       // Output: 30 (three parameters)
    println(calc.add("Hello", " World")) // Output: Hello World (String version)
}