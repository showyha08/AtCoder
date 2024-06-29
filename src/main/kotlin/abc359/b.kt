package abc359

fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }
    var total = 0L
    for (i in 0 until a.size - 2) {
        if (a[i] == a[i + 2]) {
            total++
        }
    }
    println(total)
}
