package OOpsInKotlin

fun main(){
    println(A.sum())
    println(B.text())

    SharingWidgets.incrementTwitterlikes()
    SharingWidgets.incrementTwitterlikes()
    SharingWidgets.incrementTwitterlikes()
    SharingWidgets.incrementTwitterlikes()
    SharingWidgets.incrementTwitterlikes()
    SharingWidgets.incrementFblikes()
    SharingWidgets.incrementFblikes()
    SharingWidgets.incrementFblikes()
    SharingWidgets.incrementFblikes()
    SharingWidgets.Display()

    // object as an expression with no name and all properties remains same as object
    val testObject=object {
        val x:Int=20
        fun displayObject(){
            println("I'm single object as an expression")
        }
    }
    testObject.displayObject()

/*
     Anonymous object implement interface(without creating class then implement interface then creating object of this class then override method)
     directly create object with object keyword and implement interface then override methods */
 val obj=object :Cloneable{
     override fun Clone() {
        println(" I'm clone ")
     }
 }
    obj.Clone()

    val obj2=object :Personx("cheezycode"){
        override fun fullName() {
            super.fullName()
            println("Anonymous $name")
        }
    }
    obj2.fullName()

}
/*
1. this is known as object declaration
2. create only one object at once of same type
3. agar apko multiple objects banane hai to class bana lo and  if you need only one object then use Object dacleration
4. No constructor is allowed (init block is allowed)
5. (object)you can inherit class and interface

6. Singleton pattern: means ik class ke kable ik hi object ban paye and uske multiple object na ban paye
7. Singleton object: means hm classes ko restrict karte hai ki uska kable ik hi object ban paye

               *Singleton implementation in kotlin**/
object A{
    val num:Int=10
    val num2:Int=20
    fun sum(){
        println(num+ num2)
    }

}

object B{
    val name:String="Azad"
    fun text(){
        println(" My name is $name")
    }
}

// define singleton in kotlin
object SharingWidgets{
   private var twitterlikes=0
    private var fblikes=0
   fun incrementTwitterlikes()= twitterlikes++
    fun incrementFblikes()= fblikes++
    fun Display()= println("Facebook - $fblikes -- Tweetter - $twitterlikes")
}


interface Cloneable{
   fun Clone()
}

open class Personx(val name:String){
    open fun fullName()= println("fullname is $name")
}

