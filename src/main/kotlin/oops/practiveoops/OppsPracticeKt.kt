package oops.practiveoops

data class User(val name:String)
interface CupUser{
    fun useThis()
}
data class Student(val nickName:String,val idCard:Int, val age:Int,){
    var course:String = ""
    var collage:String = ""
    var university:String =""
    init {

    }

    constructor(nickName: String,idCard: Int, age: Int,course:String,collage:String,university:String):this(nickName,idCard,age){
        this.collage = collage
        this.course = course
        this.university = university
    }
    fun work(){
        println("study")
    }


//    override fun equals(other: Any?): Boolean {
//        return super.equals(other)
//
//    }
//    override fun hashCode(): Int {
//        return super.hashCode()
//    }
//
//    override fun toString(): String {
//        return super.toString()
//    }


}


fun main(){
    val stu1 = Student("azad",1,25)
    val stu2 = Student("shekhar",2,25)
    val stu3 = stu1.copy(age = 23, idCard = 2)
   // println("stu1 $stu1 and stu3 $stu3")

    val obj1 = User("A")
    val obj2 = User("A")

    println(obj1 == obj2)



}