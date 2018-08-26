package aquarium

fun main(args: Array<String>) {
    val something = mapOf("cheese" to "nok", "beans" to "ok")
    val mapped = something.map { it.value + " :)" }
    println(mapped)

    println(something.getOrElse("milk") { "oh no" })

    val books = setOf("a", "aa", "ab", "b", "bb");
    val things = mutableMapOf("a" to "b", "c" to "d")
    println(books.any { it.length == 1 })
    println(things)
    println(things.getOrPut("e") {"t"})
    println(things)
}

