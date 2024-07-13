package abc362

fun main() {
    val (r, g, b) = readln().split(" ").map { it.toInt() }
    val c = readln()
    if (c == "Blue") {
        println(Math.min(r, g))
    } else if (c == "Red") {
        println(Math.min(b, g))
    } else {
        println(Math.min(r, b))
    }
}