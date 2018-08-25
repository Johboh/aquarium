fun main(args: Array<String>) {
    assert(false, canAddFish(10.0, listOf(3,3,3)));
    assert(true, canAddFish(8.0, listOf(2,2,2), hasDecorations = false));
    assert(false, canAddFish(9.0, listOf(1,1,3), 3));
    assert(true, canAddFish(10.0, listOf(), 7, true));

    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("angry"))
}

fun canAddFish(tankSize : Double, currentFish: List<Int>, fishSize : Int = 2, hasDecorations : Boolean = true) : Boolean {
    val totalSize : Double = fishSize.toDouble() + currentFish.sum()
    return totalSize <= tankSize * (if (hasDecorations) 0.8 else 1.0);
}

fun assert(expected : Boolean, actual: Boolean) {
    println("Test did ${if (expected != actual) "not" else ""} pass")
}

fun whatShouldIDoToday(mood : String) = when (mood) {
    "happy" -> "Go out and have fun"
    else -> "Stay home"
}