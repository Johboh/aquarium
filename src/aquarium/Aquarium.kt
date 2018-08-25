package aquarium

class Aquarium(val width: Int, val height: Int, val length: Int) {
    val volume : Int
        get() { return width * height * length }

    var water  = volume * 0.9

    constructor(numberOfFish : Int) : this(numberOfFish * 10, numberOfFish * 20, numberOfFish * 30)


}