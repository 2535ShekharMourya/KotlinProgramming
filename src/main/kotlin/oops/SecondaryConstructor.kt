package OOpsInKotlin

data class Students(val name:String, val age: Int)
data class Employee(val name: String,val age: Int,val company: String)
data class Child(val name: String,val school: String)
data class Adult(val name: String,val age: Int)

class User(val viewType: Int) {

    var studentsList: ArrayList<Students>?=null
    val employeeList: MutableList<Employee>?=null
    val childList: MutableList<Child>?=null
    val adultList: MutableList<Adult>?=null

    init {

    }
    init {

    }

    constructor(viewType: Int, list: ArrayList<Students>) : this(viewType) {
        this.studentsList=list
    }
}


fun main() {

    val list: ArrayList<Students> = arrayListOf(Students("azad",24),)
val userObj= User(1,list)
    println(userObj.studentsList)
    println(userObj.viewType)
    println(userObj.adultList)
    println(userObj.childList)


}
fun add(a: Int,b: Int): Int {


    return if (a > 2) {
        a + b
        a
        a
        b
    } else {
        b - a
        b
        a
    }
}