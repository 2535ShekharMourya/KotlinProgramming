package BasicKotlinConcepts

class TaxCollector{
    init {
        println("init TaxCollector")
    }
    fun payTaxes(salery:Int)= println("Paying taxes on salery of ${salery}..")
}
class Acountant{
    init {
        println("init Acountant")
    }
    fun findTaxSaving()= println("\t found tax savings ")
}
