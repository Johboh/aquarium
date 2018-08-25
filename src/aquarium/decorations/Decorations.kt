package aquarium.decorations

fun main(args: Array<String>) {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite", "björk")
    println(d1)

    val (rocks, wood) = d1
    println(rocks)
    println(wood)
}

data class Decorations(val rocks: String, val wood: String)

enum class Color(val rgb : Int) {
    RED(0xFF0000),
    BLUE(0x0000FF)
}

sealed class NavySeal(val tagline : String)

class Officer : NavySeal("Hey ho")

class Commander : NavySeal("go on")

fun whichSeal(seal : NavySeal) : String {
    return when(seal) {
        is Officer -> "Officer says: " + seal.tagline
        is Commander -> "Commander says: " + seal.tagline
    }
}