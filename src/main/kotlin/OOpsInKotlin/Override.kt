fun main(){
    val onePlus=OnePlus()
    onePlus.display()
    val generalMobile=Mobile()
    generalMobile.display()


}
open class Mobile{
   open val name:String=""
   open val size:Int=5
    fun makeCall()= println("calling from Mobile")
    fun powerOff()= println("Shutting down")
   open fun display()= println("Simple mobile display")

}
class OnePlus:Mobile(){
    override val name: String="One plus"  // properties overriding
    override val size: Int=6
    override fun display() = println("One plus Display") // method overriding



}





/*
open class Shape {
    open val description: String = "Generic shape"
}

class Circle : Shape() {
    override val description: String = "Circle shape"
}

fun main() {
    val shape: Shape = Circle()
    println(shape.description) // Output: Circle shape
}

 */





/*
open class Vehicle {
    open var speed: Double = 0.0
        set(value) {
            field = if (value >= 0) value else 0.0
        }
        get() = field * 0.9
}

class Car : Vehicle() {
    override var speed: Double = 0.0
        set(value) {
            field = if (value >= 0) value else 0.0
        }
        get() = field * 1.2
}

fun main() {
    val car: Vehicle = Car()
    car.speed = 100.0
    println(car.speed) // Output: 120.0
}

 */

