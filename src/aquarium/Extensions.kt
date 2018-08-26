package aquarium

fun Thing<Butter>.secure() : String = getUri().replace("http", "https")