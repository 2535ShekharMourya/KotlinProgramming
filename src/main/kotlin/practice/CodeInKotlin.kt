package practice


class Mathods(){

}

    fun main() {
//    val test = readLine()!!.toInt()
//    repeat(test) {
//        val name = readLine()!!
//
//
//    }


//        val arr = intArrayOf(2, 3, 4, 3, 5, 4, 5, 5, 7, 8, 7)
//        val obj = MethodsKT()






        val obj4 = StarbucksMachine()
        val obj5 = Customer(obj4).orderCoffee()
    }

interface CoffeeMachine {
    fun makeCoffee()
}

class StarbucksMachine : CoffeeMachine {
    override fun makeCoffee() { print("making espresso") }
}

class Customer(private val machine: CoffeeMachine) {  // client
    fun orderCoffee() = machine.makeCoffee()
}













