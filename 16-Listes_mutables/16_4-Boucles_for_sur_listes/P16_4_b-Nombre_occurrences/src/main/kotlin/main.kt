fun main() {
   val N = readln()!!.toInt()
    val numbers= List(N) {readln()!!.toInt()}

        val M = readln()!!.toInt()
        val count = numbers.count{it == M }
        println(count)

}
