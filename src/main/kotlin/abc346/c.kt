package abc346

// https://atcoder.jp/contests/abc346/tasks/abc346_c

fun main() {
    val (n, a, b) = readln().split(" ").map { it.toInt() }
    val d3 = readln().split(" ")
    val d = d3.toMutableList().map { it.toInt() % (a + b) }.distinct().sorted()

    // 1週のみで考えた場合
    if (d.last() - d.first() < a) {
        println("Yes")
        return
    }

    // 2週またぐケースを考慮
    val d2 = d + d.toMutableList().map { it + a + b }
    // 予定の間隔が休日に収まっていればOK
    for (i in 0 until d.size) {
        if (d2[i + d.size - 1] - d2[i] < a) {
            println("Yes")
            return
        }
    }
    println("No")
}