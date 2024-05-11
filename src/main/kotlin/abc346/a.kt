package abc346

// https://atcoder.jp/contests/abc346/tasks/abc346_a
fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }
    val b = mutableListOf<Int>()

    for (i in 0 until n - 1) {
        b.add(a[i] * a[i + 1])
    }
    print(b.joinToString(" "))
}