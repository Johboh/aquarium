package aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium(length = 100, height = 200, width = 300)
    println(myAquarium.length)
    println(myAquarium.height)
    println(myAquarium.width)
    println(myAquarium.volume)
    println(myAquarium.water)

    val myAquarium2 = Aquarium(numberOfFish = 7)
    println(myAquarium2.length)
    println(myAquarium2.height)
    println(myAquarium2.width)
    println(myAquarium2.volume)
    println(myAquarium2.water)
}