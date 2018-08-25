package aquarium

class Fish(var friendly : Boolean, volumeNeeded : Int) {

    val size : Int

    init {
        size = (volumeNeeded * if (friendly) 1.0 else 1.2).toInt()
    }

}