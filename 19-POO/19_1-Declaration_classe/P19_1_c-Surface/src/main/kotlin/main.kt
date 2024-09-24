class Rectangle {
    var width: Int = 0
    var height: Int = 0
}

fun printArea(Rectangle: Rectangle) {
    val area = Rectangle.width * Rectangle.height
    println("The area of rectangle is : $area")
}
fun main() {
    val Rectlangle = Rectangle()
    Rectlangle.width = 5
    Rectlangle.height = 3
    printArea(Rectlangle)
}