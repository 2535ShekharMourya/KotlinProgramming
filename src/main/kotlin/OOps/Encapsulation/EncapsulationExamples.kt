package OOpsInKotlin.Encapsulation

class BankAccountKT {
    private var balance = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) balance += amount
    }

    fun getBalance(): Double = balance
}

class Student {
    private var marks = 0
    var name: String = "azad"
    var age: Int = 24
    fun setMarks(value: Int) {
        if (value in 0..100) marks = value
    }

    fun getMarks(): Int = marks
}

fun main(){
    val account = BankAccountKT()
    account.deposit(234.0)
    account.getBalance()

    val student = Student()
    // this is  not  Encapsulation because we directly access it and modify it without any validation
    student.age = 23
    student.name = "shekhar"

    // this is Encapsulation
    student.setMarks(23)
    student.getMarks()

}