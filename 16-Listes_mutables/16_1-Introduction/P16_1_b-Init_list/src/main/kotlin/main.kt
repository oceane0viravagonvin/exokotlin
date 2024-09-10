fun main() {
    val U = 0
    val numbers = MutableList(100){ U }
    numbers [0] = 1
    numbers [9] = 10
    numbers [99] = 100
        // do not touch the lines below
        println(numbers.joinToString())
}
