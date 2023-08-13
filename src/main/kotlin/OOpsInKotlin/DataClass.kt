package OOpsInKotlin
fun main(){
    val person=Person(1,"shekhar")
    val person2=Person(1,"shekhar")
    println(person) // person.toString behind byDefualt
    println(person2)
    println(person.hashCode())
    println(person==person2)  // person.equals(person2) behind

    val p2=person.copy()
    val p3=person.copy(id=209)
    val (id,name)=person;
    println(id)
    println(name)
    println(p3)
    println(person.component2())
    println(person.component1())
}

/*
1. data class use for only store data and no function in data class
2. data class use in building application for store diff-diff layer data store like UI data , bussiness logic data,and more
3. no need to write getter and setter for each property
4. data class ke primary constructor me atleast one parameter to ho
 */
data class Person(val id:Int,val name:String){

}