fun main() {
    println("siasir un mot :")
    val word = readln()!!
    val alphab = "abcdefghijklmnopqrstuvwxyz"
    for (letter in alphab) {
        if (letter !in word) {
            print(letter)
        }
    }
    println()
}
