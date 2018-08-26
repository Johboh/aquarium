
enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game() {
    private val path = mutableListOf(Directions.START)

    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
    }
}

fun List<Int>.specialFilter(block : (Int) -> Boolean) : List<Int> = this.filter { block(it) }

fun main(args: Array<String>) {
    val game = Game()
    game.north()
    game.south()
    game.end()

    val echo = with("hello") { capitalize() }
    println(echo)

    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(numbers.specialFilter { it % 3 == 0 })
}