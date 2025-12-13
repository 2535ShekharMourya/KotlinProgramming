package enumAndSealedClasses.sealedclasses

import java.awt.Point

sealed class Tiles

class Red(val point: Int): Tiles()
class Blue(val point: Int): Tiles()
class White(val point: Int): Tiles()
class Green(val point: Int): Tiles()

fun main(){
    val tile: Tiles = Red(25)
    val points = when(tile){
        is Blue -> tile.point*2
        is Green -> tile.point*2
        is Red -> tile.point*2
        is White -> tile.point*2
    }
    println(points)
}
