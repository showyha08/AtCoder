package abc339

fun main() {
    val n = readln().toLong()
    val a = readln().split(" ").map { it.toInt() }

    var total = 0L
    var min = 0L
    for (i in 0 until a.size) {
        total += a[i]
        min = (total).coerceAtMost(min)
    }
    print(-min + total)
}
