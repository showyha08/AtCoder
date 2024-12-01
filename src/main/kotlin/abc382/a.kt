package abc382

fun main() {
    val (n, d) = readln().split(" ").map { it.toInt() }
    val s = readln()
    var cnt = 0
    for (c in s) {
        if (c == '@') cnt++
    }
    println(n - (cnt - d))
}