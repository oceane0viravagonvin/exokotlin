fun main() {
    val size = readln()!!.toInt()
    val numbers = List(size){readln()!!.toInt()}
    var tripleCount = 0
    for (i in 0 until size - 2) {
        if (numbers[i] + 1 == numbers[i + 1] && numbers[i + 1 ] + 1 == numbers[ i + 2]){
            tripleCount++
        }
    }
    println(tripleCount)
}

