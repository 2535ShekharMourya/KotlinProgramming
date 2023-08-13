package OOpsInKotlin

open class Parent(val name: String) {
    init {
        println("Parent init block: Name is $name")
    }
}
class Child(name: String, val age: Int) : Parent(name) { // Now control is on child then child call parent class constructor
    // after parent Run then Return to child and then Run child YOU can debug by own
    init {
        println("Child init block: Age is $age")
        println(name)
    }
    fun sum(){
        println("MY Name is ${name}")
    }
}

fun main() {
    val child = Child("Azad", 25) // Run child constructor
    child.sum()
}








/*
class Child(name: String, val age: Int) {
    init {
        println("Child init block: Age is $age")
    }
}
fun main() {
    val child = Child("Azad", 25)
    //   println(child.name)
    println(child.age)

    /*
    Note: so name:String is a local variable not a property or class variable it can only pass not access by object
          but val age:Int is a property or class variable  you can access by object
     */

}

 */







/*
pen class Shape(val type: String) {
    constructor(type: String, sides: Int) : this(type) {
        println("Shape with $sides sides")
    }
}

class Triangle(type: String, sides: Int, val base: Double, val height: Double) : Shape(type, sides) {
    init {
        println("Triangle created: Base $base, Height $height")
    }
}

fun main() {
    val triangle = Triangle("Triangle", 3, 5.0, 8.0)
}

 */




/*
open class Vehicle(val brand: String) {
    init {
        println("Vehicle brand: $brand")
    }
}

class Car(brand: String, val model: String) : Vehicle(brand) {
    init {
        println("Car model: $model")
    }
}

class ElectricCar(brand: String, model: String, val batteryCapacity: Double) : Car(brand, model) {
    init {
        println("Electric car with battery capacity: $batteryCapacity kWh")
    }
}

fun main() {
    val electricCar = ElectricCar("Tesla", "Model S", 85.0)
}

 */






/*
open class Person(val name: String, val age: Int) {
    constructor(name: String) : this(name, 0) {
        println("Secondary constructor for $name")
    }
}

class Student(name: String, age: Int, val grade: Int) : Person(name, age) {
    init {
        println("Student: $name, Age: $age, Grade: $grade")
    }
}

fun main() {
    val student = Student("Alice", 15, 9)
}

 */



