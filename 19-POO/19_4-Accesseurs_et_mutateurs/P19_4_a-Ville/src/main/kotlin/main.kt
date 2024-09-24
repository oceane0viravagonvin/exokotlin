class City(val name: String, population: Int =0) {
    var population: Int = 0
        set(value) {
            field = when{
                value <0 -> 0
                value > 50_000_000 -> 50_000_000
                else -> value
        }
    }
}

fun main() {
    val goodCity = City("Good City")
    val badCity = City("Bad City")

    badCity.population = 65_000_000
    println(badCity.population)

    goodCity.population = 45_000_000
    println(goodCity.population)
}