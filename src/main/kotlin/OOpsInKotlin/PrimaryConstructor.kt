class Automobile(val name: String, val tayers: Int, val maxseeting: Int, hasAirbag: Boolean)//primary constructor
{
    //jab bhi tum constructor me val ya var use karoge to bo uski property ban jayegi otherwise bo ik simple parameter hoga
    val yesAirbage: Boolean = hasAirbag

    // initializer block constructor call per sequence me chalte hai
    init {
        println("$name  is create")
    }

    fun Drive() {}

    init {
        println("sai hai")
    }

    fun applyBreak() {}
}

class empty {}

class person() {
    var name: String = ""
    var age: Int = 0;
    // Use 'var' instead of 'val' if you want to ReAsign or change the value of variable in future
}

class Student2(name: String, age: Int) {
    // with this way of Constructor you con perform operations on passed values   ye sai hai
    val NameStu: String = "$name -hi"  //  $ is for append in a given String
    val ageStu: Int = age
    val canvote: Boolean = age > 18
    val IncreseAge: Int = age + 4


}

class Employee(name: String, salary: Int, Company: String) {


}

//Constructor used for initialize  object's property of class or matlab object ko ek default value dene ke liye use hote hai constructor
fun main(abs: Array<String>) {
    val p1 = person()
    p1.age = 23 // this is right to asign the value to the claas property
    p1.name = "shekhar"
    println(p1.age)
    println(p1.name)

    var s1 = Student2("shiv", 22)
    println(s1.canvote)
    println(s1.IncreseAge)

    val A1 = Automobile("tata", 4, 4, true)
    println(A1.yesAirbage)


}