fun main() {
    print("House :")
    val n = readln().toString()
    println("Vous avez saisi : $n")
    if (n == "Slytherin"){
        println("Cunning")
    }
    else if (n == "Hufflepuff"){
        println("loyalty")
    }
    else if (n == "Gryffindor"){
        println("bravery")
    }
    else if (n == "Ravenclaw"){
        println("intellect")
    }
    else {
        println("not a valid house")
    }
}
