package OOpsInKotlin

/*
 1. abstract method ki koi body nahi hoti
 2. if class me atleast one abstract method hai to class ko bhi abstract karna padega
 2. abstract method ko use karne ke liye child class me isko override karna hoga or abstract method ko body deni hogi
 3. abstract methods are incomplete methods
 4. so class also incomplete
 5. so we can't create objects of this class or can't use this class
 6. Abstract class use when you have not clear idea about implementation of methods . matlab aadhi adhuri jankari about anything

 */
abstract class test {
    var Roll:Int=209;
    abstract fun message()
    fun Sayhello() {
        println("hello bro")
    }
}

class TestImp : test() {
    override fun message() {
        println("this is child")
    }

}

fun main() {
    val obj1 = TestImp()
    obj1.message()
    obj1.Sayhello()
}

