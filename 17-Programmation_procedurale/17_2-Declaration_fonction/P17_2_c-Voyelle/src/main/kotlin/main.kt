fun isVowel( char : Char): Boolean {
    val vowel = listOf('a','e','i','o','u', 'A','E','I','O','U')
    return char in vowel
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
