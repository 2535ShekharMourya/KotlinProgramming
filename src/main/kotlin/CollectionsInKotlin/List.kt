package CollectionsInKotlin

fun main() {
    /*
    1.list is ordered i mean maintain order of element
    2. listOf immutable matlab list ko change nahi kar sakte na hi size of list
    3. mutableListOf can change size add element orderd
    4. duplicate allow
     */
    var list = listOf<Int>(12, 423, 53, 64)
    println(list.contains(12))
    println(list.size)
    for (e in list) {
        println(e)
    }

    var list1 = mutableListOf<Int>(12, 5, 3, 5, 7, 86, 7)
    list1.add(234)
    println(list1)

    /*
    1. Unordard or order of element not maintain
    2. duplicate not allow
    3. both mutable and immutable sets like list
     */
    var set = setOf<Double>(23.4, 23.5, 75.6)
    println(set.contains(23.4))
    println(set.size) // explore methods

    var set1 = mutableSetOf<Double>(122.3, 34.5, 13.5, 34.5)
    for (e in set1) {
        println(e)
    }
    set1.add(23.53)


    var map = hashMapOf<String, Int>("shekhar" to 20, "azad" to 23)
    var a = map.get("shekhar")
    println(a)
    for (e in map) {
        println(e)
    }


}