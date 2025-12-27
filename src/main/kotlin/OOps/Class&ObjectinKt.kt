class Car(val prize: Int, val naem: String, val color: String)// class properties
{
    fun DriveCar() { // class method or show behebior
        println("car driving by ")
    }

    fun isWorking() {
        println("Sai hai")
    }
}

class Student(val name: String, val age: Int) {
    fun canvote(): Boolean {
        return age > 18
    }
}



class CSStudent(){
    var name:String="azad" // default value or CSstudent object you can change letter
    var age:Int=20; // var age=20  both are same
    // what if 1000 variables
    fun work(){
        println("${name} doing coding")
    }
}

//class matlab user define data type matlab ham khud decide karte hai hamara data kaisa hai nature me
//Main function, Entry Point of Program
fun main(args: Array<String>) {

    val carObj1 = Car(1200000, "tata", "Red")
    val carObj2 = Car(13000000, "lomborgini", "yelloe")
    val i: Int = 10;
    //  println(i.plus(10))  method hamesa properties ke behaf pe kam karta hai
    //   println(i.toFloat())
    val stud1 = Student("shekhar", 12)
    val stud2 = Student("azad", 23)
    println(stud2.canvote())// method hamesa properties ke behaf pe kam karta hai or hamari properties kaisi hai os basis par kam karta hai methods
    println(stud1.canvote())

 // what if create 1000 object
    val s1=CSStudent();
    s1.name="shekhar" // this is not good practice to initialize objecte value
    s1.age=23;
    val s2=CSStudent()
    s2.age=22
    s2.name="uttam"
    s1.work() // problem : here both objects hold same values but we want every object hold diffrent value so how to assign diff value to the object
    s2.work() // solution: 1.you can modify properties with object reference 2. use constructor



}

