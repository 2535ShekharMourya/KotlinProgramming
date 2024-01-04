

import java.util.Scanner
class CarLambo(val name:String,val Price:Int){
    val madel:Int=23;
    val logo:String="L"
    val color:String="Red"
}
class CarTata(name: String,price:Int,color: String){
    val name1="tata"
}
fun main(){
    val car1=CarLambo("Lombogini",23000000)
    println(car1.Price)
    val car2=CarTata("Tata",2990000,"bule")


}







/*
1. data class use for only store data and no function in data class
2. data class use in building application for store diff-diff layer data store like UI data , bussiness logic data,and more
3. no need to write getter and setter for each property
4. data class ke primary constructor me atleast one parameter to ho
 */

