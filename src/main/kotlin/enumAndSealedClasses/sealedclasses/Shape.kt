package enumAndSealedClasses.sealedclasses

sealed class Shape

data class Circle(val radius: Double) : Shape()
data class Rectangle(val width: Double, val height: Double) : Shape()
data class Square(val sideLength: Double) : Shape()

fun Shape.calculateArea(): Double {
    return when (this) {
        is Circle -> Math.PI * radius * radius
        is Rectangle -> width * height
        is Square -> sideLength * sideLength
    }
}

fun main() {
    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)
    val square = Square(4.0)

    println("Circle area: ${circle.calculateArea()}")
    println("Rectangle area: ${rectangle.calculateArea()}")
    println("Square area: ${square.calculateArea()}")
}