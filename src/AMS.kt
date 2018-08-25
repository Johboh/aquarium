import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>) {
    assert(false, canAddFish(10.0, listOf(3,3,3)));
    assert(true, canAddFish(8.0, listOf(2,2,2), hasDecorations = false));
    assert(false, canAddFish(9.0, listOf(1,1,3), 3));
    assert(true, canAddFish(10.0, listOf(), 7, true));

    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("angry"))
    println(funWithWhen(20, "no"))

    val dirty = {dirty : Int -> dirty > 30}
    println(dirty(30))

    println(checkOk("OK", isOk))
    println(checkOk("OK") { ok -> if (ok == "OK") 999 else 111 })
}

val isOk: (String) -> (Int) = { ok -> if (ok == "OK") 666 else 333  }
fun checkOk(isThisOk : String, operation : (String) -> (Int)) : Int {
    return operation(isThisOk)
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

fun funWithWhen(number : Int, lucky : String) : String {
    return when {
        isLucky(number) -> "Its your lucky number"
        lucky == "I'm lucky" -> "You are lucky"
        else -> "No luck today."
    }
}

fun isLucky(lucky : Int) = lucky in 1..30