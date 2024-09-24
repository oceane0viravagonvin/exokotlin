class Car(val make: String, val year: Int) {

    var speed: Int = 0

    fun accelerate(){
        speed += 5
    }
    fun decelerate(){
        speed -= 5
        if (speed <0) else 0
    }
}

fun main() {
    val myCar = Car("Mustang", 1976)
    myCar.accelerate()
    println(myCar.speed)
    myCar.decelerate()
    myCar.decelerate()
    println(myCar.speed)
}