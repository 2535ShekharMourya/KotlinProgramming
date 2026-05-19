package OOpsInKotlin.Polimorphism

// Parent class
open class Animal {
    open fun makeSound() {
        println("Some generic animal sound")
    }
    open fun eat() {
        println("Animal is eating")
    }
}
// Child classes
class Dog : Animal() {
    override fun makeSound() {
        println("Woof! Woof!")
    }
}
class Cat : Animal() {
    override fun makeSound() {
        println("Meow! Meow!")
    }
}
class Cow : Animal() {
    override fun makeSound() {
        println("Moo! Moo!")
    }
}


open class Shape {
    open fun draw() {
        println("Drawing a shape")
    }
}
class Circle : Shape() {
    override fun draw() {
        println("Drawing a circle")
    }
}
class Rectangle : Shape() {
    override fun draw() {
        println("Drawing a rectangle")
    }
}
fun main() {
    // Polymorphism in action - same reference type, different behaviors
    val animal1: Animal = Dog()
    val animal2: Animal = Cat()
    val animal3: Animal = Cow()

    animal1.makeSound()  // Output: Woof! Woof!
    animal2.makeSound()  // Output: Meow! Meow!
    animal3.makeSound()  // Output: Moo! Moo!

    // Using polymorphism with a list
    val animals: List<Animal> = listOf(Dog(), Cat(), Cow())

    println("\nAll animals making sounds:")
    for (animal in animals) {
        animal.makeSound()  // Each calls its own version
    }

    val shape1: Shape = Circle()
    val shape2: Shape = Rectangle()

    shape1.draw()
    shape2.draw()
}