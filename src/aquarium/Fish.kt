package aquarium

class Fish(var friendly : Boolean, volumeNeeded : Int) {

    val size : Int

    init {
        size = (volumeNeeded * if (friendly) 1.0 else 1.2).toInt()
    }

}

class MyFish(fishColor : FishColor = GreenColor) : FishAction, FishColor by fishColor {
    override fun eat() {
        println("I'm $color and its yummy");
    }
}

interface FishColor {
    val color : String
}

interface FishAction {
    fun eat()
}

object GreenColor : FishColor {
    override val color: String
        get() = "green"
}

object BlueColor : FishColor {
    override val color: String
        get() = "blue"
}