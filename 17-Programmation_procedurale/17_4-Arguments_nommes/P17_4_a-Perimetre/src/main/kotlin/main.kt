import kotlin.math.hypot

fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double = x3, y4: Double = y3): Double {
    val l1 = hypot((x2-x1), (y2-y1))
    val l2 = hypot((x2-x3), (y2-y3))
    val l3 = hypot((x4-x3), (y4-y3))
    val l4 = hypot((x4-x1), (y4-y1))
    return l1+l2+l3+l4
}

fun main() {
    println(perimeter( 0.0, 0.0, 12.0, 0.0, 0.0, 5.0))
}