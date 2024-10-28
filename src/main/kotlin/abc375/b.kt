package abc375

fun main() {
    val n = readln().toInt()
    var x1 = 0.0
    var y1 = 0.0
    var total = 0.0
    repeat(n) {
        val (x2, y2) = readln().split(" ").map { it.toDouble() }
        val dis1 = (x1 - x2) * (x1 - x2)
        val dis2 = (y1 - y2) * (y1 - y2)
        val kyori = dis1 + dis2
        val sqrt = Math.sqrt(kyori)
        total += sqrt
        x1 = x2
        y1 = y2
    }

    val x2 = 0.0
    val y2 = 0.0
    val dis1 = (x1 - x2) * (x1 - x2)
    val dis2 = (y1 - y2) * (y1 - y2)
    val kyori = dis1 + dis2
    val sqrt = Math.sqrt(kyori)
    total += sqrt

    println(total)
}
