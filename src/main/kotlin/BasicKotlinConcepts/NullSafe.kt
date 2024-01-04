package BasicKotlinConcepts

fun main() {
//    DataType? allow 'null' and 'values' both to remove nullPointerException
//    when we don't know the value at any time then use nullable
    val gender1: String = "male" //  val vari:String=" "  non-nullable datatype
    val gender2: String? = null // val vari:String?=" " nullable datatype
    val isAudult: Boolean? = null
    val isnotAudult: Boolean? = true
    val name: String? = "azad"
    val rollno: Int? = 23
    val cgpa: Double? = 6.5

    // Method1 (check null or not null)
    if (gender2 != null) { // first check that Reference variable nullable or not (val name:String?="azad" or val name:String?=null)
        println(gender2.uppercase())
    }
    gender1.uppercase() // no need to check Reference variable nullable or not direct call methods(val name:String="azad")

    // method2 (safecall)
    // if gender2 null then do not call uppercase() method and if gender2 not null then call uppercase() method this is called safe call operator
    println(gender2?.uppercase())

    gender2?.let {
        println("line 1")
        println("line 2 : ${gender2}")
        println("line 3 : $it")

    }

    val a="azad"
    val selectedValue: String? =gender2
    val selvaule:String=gender2 ?: "Na"

    // if gender2 is null then show error otherwise call method
    val value= gender2!!.uppercase()

}