// Constructor : it initialize the object or assign value to the object
package OOpsInKotlin
class CSStudent{// default constructor
    var name:String="azad" // default value or CSstudent object you can change letter
    var age:Int=20; // var age=20  both are same
    // what if 1000 variables
    fun work(){
        println("${name} doing coding")
    }
}




class Animal(val name:String,val color:String)// class ClassName() here () shows primary constructor
// class Animal() also primary constructor
{
    val AnimalName:String
    val AnimalColor:String
    init {
        // initializer block chalege jab constructor chalega this is useful when constructor me jo value
        // pass ki hai Use kisi dusre variable me store karana ho
        AnimalName=name;
        AnimalColor=color
        println("initializer block")
    }
fun display(){
    println("Name of animal is ${name}")
    println("color of animal is ${color}")
    println()
}
}




class Apple{
    val color:String
    val price:Double
    constructor(color: String,price:Double){
       this.color=color
        this.price=price
    }
    fun displayApple(){
        println("Apple color is ${color}")
        println("Apple price is ${price}")
    }
}

    fun main(){
        // what if create 1000 object
        val s1=CSStudent();
        s1.name="shekhar" // this is not good practice to initialize objecte value
        s1.age=23;
        val s2=CSStudent()
        s2.age=22
        s2.name="uttam"
        s1.work() // problem : here both objects hold same values but we want every object hold diffrent value so how to assign diff value to the object
        s2.work() // solution: 1.you can modify properties with object reference 2. use constructor




        val A1=Animal("cow","white") // good practice to initialize object value
        val A2=Animal("dog","black")
       // A1.display()
        //A2.display()
        //println(A1.name+" "+A1.color)
       // println(A2.name+" "+A2.color)
        println(A1.AnimalColor+" "+A2.AnimalName)




        val apple1=Apple("pink",234.43)
        val apple2=Apple("Red",254.43)
        val apple3=Apple("green",134.43)
        apple1.displayApple()
        apple2.displayApple()
        apple3.displayApple()
    }
