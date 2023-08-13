package OOpsInKotlin
/*
1. methods bydefault abstract and concreate also
1. properties always abstract
3. important note: so  'class' , 'interface', 'abstract' all uses for creating user define datatype
 */
interface MyInter{
    //var Roll:Int=323; you can't initialize property
    var Roll:Int
    fun m1()   // Abstract method
    fun M2(){  // Normal method
        println("this is my m2 method of MYInter")
    }

}
class MyInterImpl() :MyInter{
    // important note: if class extents any interface then you need to override all method within the class otherwise show error or incomplete class
    override var Roll: Int=23
    override fun m1() {
        println("this is override method")

    }

}
fun main(){
  //  var obj1=MyInter()    interface dose not have any constructors
    val obj1=MyInterImpl()
    obj1.Roll=20
    obj1.m1()
    obj1.M2()
}