class Calculator{ // no constructor define then default constructor call
//    vor Massege:String   show error
    lateinit var massege1:String  //sai hai
    // lateinit val massege2:String     lateinit allow for only mutable properties  error

    /*
    POINT TO BE NOTED
    1. in kotlin you need to always declare as well as initialize both at same time to overcome Runtime error
    2. some senarios when i don't know what will be the initiale value of this variabe then i use lateinit
    3. lateinit it is a way or matlab hm iski value bad me denge ke kotlin me ik provision hai
    4. lateinit  -> not empty  and not null
        4.1  lateinit always var type not val type
        4.2  and in properties ko hm int,float,boolean nahi bana sakte
     */
    fun add(a:Int,b:Int):Int{
        return a+b;
    }
    fun mult(a:Int,b:Int):Int{
        return a*b;
    }
}
fun main(){
  val obj1=Calculator()//kotlin creat default constructor when we can't create and this is non-parametrize
  println(obj1.add(2,3))
    println(obj1.mult(2,3))
}
