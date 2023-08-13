import java.util.SplittableRandom

class Person2(namePar:String,agePara:Int){
    var name:String=namePar
        get() {
            println("this code is running")
            return field.toUpperCase()
        }
    var age:Int=agePara
        set(value) {
            if (value>0) field=value
            else
                println("age can't be negative")
        }

    // if we don't define getter and setter then kotlin bydefault write this methods
    // syntax
    var email:String=""
      /*
      default syntax for getter and setter in kotlin
       get() = field
        set(value) {
            field=value
        }*/

}

fun main(){
    var p1=Person2("A",20)
    // '.' is use for get and set values
    println(p1.age )// get value
    p1.name="azad"  // set value
    p1.age=-20 // this is not possible but no error so getter and setter comes up
    println(p1.name)
}