package abc358

fun main() {
    val (n, a) = readln().split(" ").map { it.toInt() }
    val t = readln().split(" ").map { it.toInt() }
    var total = 0L
    repeat(n) {
        val w:Long
        if (t[it] < total) {
            w = total + a
        } else {
            w = (t[it] + a).toLong()
        }
        println(w)
        total = w
    }
}
