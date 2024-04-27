package abc351

// https://atcoder.jp/contests/abc351/tasks/abc351_a
fun main() {
    val a = readln().split(" ").map { it.toInt() }.toMutableList().sum()
    val b = readln().split(" ").map { it.toInt() }.toMutableList().sum()
    val o = a - b + 1
    if (a - b + 1 <= 0) {
        print(0)
    } else {
        print(o)
    }
}