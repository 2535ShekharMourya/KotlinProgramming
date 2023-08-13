class Automobi(val name: String, val tayers: Int, val maxseeting: Int, val engineType: String) {
    init {
        println("$name Moters")
    }

    init {
        println("$engineType  desel")
    }

    constructor(namepara: String, enginePara: String) : this(
        namepara,
        4,
        5,
        enginePara
    )//you have to call primary constructor
    // for use of secondry constructor
}

fun main(args: Array<String>) {
    val car1 =
        Automobi("tata", "desel")//first call secondry constructor and Secondry Constructor call primary constructor
    val car2 = Automobi("ford", "petrol")
    val car3 = Automobi("farari", "electric")

}
