fun main() {
    println("saisir des nombres:")
    val N = readLine()!!.toInt()
    println("Entrez la valeur $N nombre :")
    var minValue = Int.MAX_VALUE
    for (i in  1 until N) {
        val num = readLine()!!.toInt()
        if (num < minValue) {
            minValue = num
        }
    }
        println("La valeur min est : $minValue")
}
