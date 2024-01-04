package BasicKotlinConcepts

class  A1{

val color:String
val prize:Int
constructor(color:String,prize:Int){
 this.color=color
    this.prize=prize
}
    fun dis(){
        println("color is ${color}")
        println("prize is ${prize}")
    }

}


fun main(){

val o1=A1("red",20)
    val o2=A1("orenge",30)
    o1.dis()
    o2.dis()

}