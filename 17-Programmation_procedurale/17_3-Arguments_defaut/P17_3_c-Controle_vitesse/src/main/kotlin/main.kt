fun checkSpeed(speed: Int, limit:Int=60) {
    val voiture : Int
    if (speed > limit){
        voiture = speed - limit
        return println("Exceeds the limit by $voiture kilometers per hour")

    }else{
        return println("Within the limit")
    }
}

fun main() {
    checkSpeed(100, 60)
    checkSpeed(40, 90)
    checkSpeed(61)
    checkSpeed(60)
}