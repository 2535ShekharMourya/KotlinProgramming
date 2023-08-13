package OOpsInKotlin

import java.lang.Exception
import java.util.InputMismatchException
import java.util.Scanner

fun main(){
    println("program started")
    val obj=Scanner(System.`in`)
   try {
       // Agar tumhe lage ki is code me ya is jagah par Runtime per exception aa sakti hai to us code ko try bale block me dal do without thingking twice
       val a=obj.nextInt()
       val b=obj.nextInt()
       val c=a/b
       println(c)
   }catch (e:ArithmeticException){ // possible exceptions handle to succesfully end program
       println("Exception occur ${e.message}")
   }
    catch (e:InputMismatchException){
        println("Invalid input !! ${e.message}")
    }
    catch (e:Exception){
        println("Error  ${e.message}")
    }
    finally {  // print any message chahe try chale ya catch finally har bar chalega
        println("thankYOu")
    }
    println("program ended")
}
