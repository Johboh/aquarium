package aquarium

fun Thing.secure() : String = getUri().replace("http", "https")