package OOpsInKotlin
/*
In Kotlin, an object reference refers to a way of accessing and interacting with an instance of a class or data type that is stored in memory.
 It's a value that points to the memory location where the object's data is stored.
  When you create an instance of a class, you're essentially allocating memory to hold the object's properties and data,
   and the object reference is used to access and manipulate that data.


Here are a few key points to understand about object references in Kotlin:

Reference vs. Object: An object reference is not the object itself, but rather a way to access it.
 It's like a pointer or a handle to the object's location in memory.
  The reference allows you to perform operations on the object and access its properties and methods.

Passing References: When you pass an object as an argument to a function or assign it to a variable, you're passing a reference to the object.
This reference allows the function or variable to work with the same object that was created outside of the function.

Mutability and References: Whether an object is mutable (its properties can be changed) or
immutable (its properties cannot be changed) is independent of the concept of object references.
Both mutable and immutable objects are accessed through references.

Null References: Kotlin has a type system that helps prevent null pointer exceptions.
References in Kotlin can also hold a special value null, which indicates the absence of an object.
This allows you to handle cases where an object reference doesn't point to an actual object.


data class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person("Alice", 25)
    val person2 = person1 // Both person1 and person2 now refer to the same object in memory

    println(person1) // Output: Person(name=Alice, age=25)
    println(person2) // Output: Person(name=Alice, age=25)

    person2.name = "Bob" // Modifying through one reference affects the object accessed through both references

    println(person1) // Output: Person(name=Bob, age=25)
    println(person2) // Output: Person(name=Bob, age=25)
}


In this example, person1 and person2 are two references that both point to the same object in memory.
Modifying the object's name property through one reference affects the object accessed through both references.

 */






/*
n Kotlin, there is a distinction between primitive types and reference types.
Primitive types include basic data types like numbers and characters,
while reference types include objects created from classes or data classes.

In Kotlin, the primitive types are not treated as objects,
and they do not have object references in the same way that classes or data classes do.
 Instead, primitive types are optimized for performance and memory usage, and they are stored directly as values.

The primitive data types in Kotlin are:

Byte: 8-bit signed integer
Short: 16-bit signed integer
Int: 32-bit signed integer
Long: 64-bit signed integer
Float: 32-bit floating-point number
Double: 64-bit floating-point number
Char: 16-bit Unicode character
Boolean: Represents true or false values
When you work with these primitive types, you are dealing with values directly, and no object references are involved. For example:


fun main() {
    val num1: Int = 42
    val num2: Int = num1 // This is a direct copy, not a reference

    println(num1) // Output: 42
    println(num2) // Output: 42

    num2 = 24 // Reassigning num2, num1 remains unchanged

    println(num1) // Output: 42
    println(num2) // Output: 24
}


In Kotlin, there is a distinction between primitive types and reference types. Primitive types include basic data types like numbers and characters, while reference types include objects created from classes or data classes.

In Kotlin, the primitive types are not treated as objects, and they do not have object references in the same way that classes or data classes do. Instead, primitive types are optimized for performance and memory usage, and they are stored directly as values.

The primitive data types in Kotlin are:

Byte: 8-bit signed integer
Short: 16-bit signed integer
Int: 32-bit signed integer
Long: 64-bit signed integer
Float: 32-bit floating-point number
Double: 64-bit floating-point number
Char: 16-bit Unicode character
Boolean: Represents true or false values
When you work with these primitive types, you are dealing with values directly, and no object references are involved. For example:

kotlin
Copy code
fun main() {
    val num1: Int = 42
    val num2: Int = num1 // This is a direct copy, not a reference

    println(num1) // Output: 42
    println(num2) // Output: 42

    num2 = 24 // Reassigning num2, num1 remains unchanged

    println(num1) // Output: 42
    println(num2) // Output: 24
}
In this example, num1 and num2 are both primitive Int values.
 When num2 is assigned the value of num1, a direct copy of the value is made. Modifying one variable does not affect the other.

Unlike reference types (objects), primitive types do not have methods or properties associated with them.
 They are treated as values rather than instances of classes.

It's important to note that while Kotlin has primitive types for performance optimization,
the distinction between primitive types and reference types is mostly transparent to developers.
 Kotlin's type system and the way you work with variables and values are designed to be intuitive and consistent,
 regardless of whether you're dealing with primitive types or reference types.
 */






/*
Primitive Type Variable Example:
Primitive types in Kotlin include Int, Double, Boolean, and so on. These types store simple values directly without using object references.


fun main() {
    val num: Int = 42 // Primitive type variable
    var isTrue: Boolean = true // Another primitive type variable

    val copiedNum: Int = num // Direct copy of the value

    println(num) // Output: 42
    println(copiedNum) // Output: 42

    isTrue = false // Modifying a primitive type variable
    println(isTrue) // Output: false
}
In this example, num and copiedNum are both primitive Int variables.
When copiedNum is assigned the value of num, a direct copy of the value is made. Modifying one variable does not affect the other.

Reference Type Variable Example:
Reference types in Kotlin are instances of classes or data classes.
 These types are accessed through object references, which point to the memory location where the object's data is stored.


data class Person(val name: String, val age: Int)

fun main() {
    val person1: Person = Person("Alice", 25) // Reference type variable
    val person2: Person = person1 // Both references point to the same object

    println(person1) // Output: Person(name=Alice, age=25)
    println(person2) // Output: Person(name=Alice, age=25)

    person2.name = "Bob" // Modifying the object's property through one reference

    println(person1) // Output: Person(name=Bob, age=25)
    println(person2) // Output: Person(name=Bob, age=25)
}
In this example, person1 and person2 are both reference type variables, holding references to the same Person object.
 Modifying the object's name property through one reference affects the object accessed through both references.

Key Differences:

Storage and Direct Access:
Primitive types are stored directly as values and can be accessed directly without using references.
Reference types are instances of classes or data classes and are accessed through object references.

Mutability:
Primitive type variables hold immutable values. You cannot change the actual value of a primitive type variable.
Reference type variables can hold mutable objects,
and modifications made through one reference affect the object accessed through other references.

Copying Behavior:
When copying a primitive type variable, the value is directly copied.
When copying a reference type variable, a new reference is created that points to the same object (shallow copy).
In summary, primitive types store simple values directly, and modifications do not affect other variables.
 Reference types involve object references, and changes made through one reference can affect other references pointing to the same object.






 */



/*
If you want to modify the state of an object that you've passed to a function,
 the modifications will affect the original object outside the function.
 This is because you're modifying the same underlying object that the reference points to.
 */
data class Prson(var name: String)

fun modifyPerson(prson: Prson) {
    prson.name = "Alice"
}

fun main() {
    val prson = Prson("Bob")
    println("Before modification: ${prson.name}")

    modifyPerson(prson)

    println("After modification: ${prson.name}")
}
/*



fun modifyString(text: String) {
    // This won't modify the original string, as strings are immutable
    // A new string is created and assigned to the local 'text' variable
}

fun main() {
    val message = "Hello, world!"
    println("Before modification: $message")

    modifyString(message)

    println("After modification: $message")
}

 */
/*
In this example, the modifyString function takes an immutable String parameter.
 Since strings are immutable, any modifications made inside the function create new string instances.
 The original string remains unchanged outside the function.

Remember that in Kotlin, whether you're dealing with mutable or immutable objects,
 when you pass an object reference to a function, you're passing a copy of the reference,
 allowing you to modify the state of the object it points to.
 */







/*


data class Point(var x: Int, var y: Int)

fun modifyPoint(point: Point) {
    point.x = 10
    point.y = 20
}

fun main() {
    val point = Point(5, 5)
    println("Before modification: (${point.x}, ${point.y})")

    modifyPoint(point)

    println("After modification: (${point.x}, ${point.y})")
}

 */
/*
In this example, the modifyPoint function modifies the x and y properties of the Point object.
The changes made inside the function are reflected in the original object outside the function.
 */





/*

fun reassignReference(list: MutableList<Int>) {
    list = mutableListOf(4, 5, 6)
}

fun main() {
    val numbers = mutableListOf(1, 2, 3)
    println("Before reassignment: $numbers")

    reassignReference(numbers)

    println("After reassignment: $numbers")
}

 */
/*
In this example, the reassignReference function tries to reassign the reference of the list parameter to a new MutableList.
However, this reassignment only affects the local copy of the reference inside the function and doesn't change the original list outside the function.

 */

