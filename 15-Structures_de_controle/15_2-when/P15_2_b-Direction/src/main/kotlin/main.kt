fun main() {
    print(" number :")
    val n = readln().toInt()
    println("Vous avez saisi : $n")
    if (n == 1){
        println("move up")
    }
    else if (n == 2){
        println("move down")
    }
    else if (n == 3){
        println("move left")
    }
    else if (n == 4){
        println("right")
    }
    else if (n == 0){
        println("do not move")
    }
    else {
        println("error")
    }
}
