package practice

open class MethodsKT(){
    fun addTwo(a: Int,b: Int): Int{
        return a+b
    }

    fun findRepeating(nums: List<Int>){
        val set = HashSet<Int>()
        for (num in nums) {
            if (num in set){
                println("duplicate")
                return
                // duplicate found
            }
            set.add(num)
        }
        println("no duplicate")

    }
}
