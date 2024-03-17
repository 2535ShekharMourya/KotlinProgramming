import BasicKotlinConcepts.Acountant
import BasicKotlinConcepts.TaxCollector

/*  Uses of lazy initialisation
1. if you have a database objects or some heavy object which is only needed when it is use
2.you save memory because you don't need to initialize before use
3. lazy have only getter method not setter method so lazy always val not var

* */
private const val SALERY_THRESHOLD = 100


private val taxcollector = lazy { // same as below but syntax different
    TaxCollector()
}
private val tax by taxcollector

// private val TaxCollector=TaxCollector()  initialize first no matter it is needed or not so this is not good practice
private val TaxCollector by lazy { // initialize only when it is needed otherwise not initialize
    TaxCollector()
}

//private val accountandt=Acountant()
private val accountent by lazy {
    Acountant()
}


fun main() {
    println(" is taxtCollector initialize ${taxcollector.isInitialized()}")
    val saleries = listOf<Int>(50, 70, 20, 60, 120)
    for (salery in saleries) {
        TaxCollector.payTaxes(salery)
        tax.payTaxes(salery)
        println("\" is taxtCollector initialize ${taxcollector.isInitialized()}\"")
        if (salery > SALERY_THRESHOLD) accountent.findTaxSaving()

    }


}
