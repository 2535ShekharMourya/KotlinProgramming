package oops.constructore

data class User(val name:String,val age:Int){
    init {
        require(age>0){"age must be greater then 0"}
    }
}
fun main(){
    val user = User("azad",-20)
    println(user)
}