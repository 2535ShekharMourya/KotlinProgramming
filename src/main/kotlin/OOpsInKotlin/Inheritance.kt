/*
  parent class   -------------->   child class
  Base class     -------------->   derived class  (name diff but meaning same child and parent)
  super class    -------------->   sub class
 */
// kotlin me bydifault sari classes final hoti hai
// Ex. 'final class parent ' so inherite karne ke liye Parent class ko open karna hota hai
open class parent{
    val name:String=""
    fun MyMethod(){
        println("i am in parent")
    }
}
class child:parent(){ //cannot inherit multiple classes or kotlin support single level inheritenc
    val name2:String=""
    fun MyMethod2(){
        println("i am in child")
    }
}




// parent class
 open class perso(){
    var id:Int=123;
   open fun display(){  // overriden function : parent ka function jo override ho raha hota hai
       // bydefault methods final hote hai so override karne ke liye open karna hota hai like class enheritenc
        println("hello my id is ${id}")
    }

}
// child class
class Imp(var name:String) :perso()  // Jab bhi Imployee class ka object banege bo Person() class ke primary constructor ko call karke Person class ka object bana dega
{
// Imp(name:String) local variable :   Imp(var name:String) id field ban gayi class me or class ki property
    fun displayImp(){
        println("this is my name ${name} and this is my id ${id}")
    }
    // method overriding : matlab parent class ke method ko nai body dena and usme changes karna or hamesa overriden method hi chalega
   override fun display(){ // function overriding : bc of child method override kar raha hai
        // overriding me parameter,name of method sub kuch same rakna hota hai keble body change karte hai
       println("this is child block")
    }

}
fun main(args:Array<String>){
    // parent constructor call first then child constructor calls
    val Objchild=child()
    Objchild.MyMethod2()
    Objchild.MyMethod()



    val obj1=Imp("shekhar")
   // obj1.display()
    obj1.id=12;
    obj1.display()  // parent ka method hai but abhi chal child ka override method raha hai so hamesa overriding method chalta hai
    obj1.displayImp()

}




