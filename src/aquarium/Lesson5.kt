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

    val thing = Thing(91, Butter)
    println(thing.getUri())
    println(thing.secure())
}

interface Spread {
    fun apply() : String
}



class Thing<T : Spread>(private val level : Int, private val spread : T) {
    companion object {
        const val BASE_URI = "http://thing.com/%d"
    }

    fun getUri() : String {
        check(level > 5) { "Level must be greater than 5" }
        return String.format(BASE_URI, level) + spread.apply()
    }
}

object Butter : Spread {
    override fun apply(): String {
        return "/yummy"
    }
}