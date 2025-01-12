package abc387

fun main() {
    val (a, b) = readln().split(" ").map { it.toDouble() }
    println(Math.pow(a + b, 2.0).toInt())
}