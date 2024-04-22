package abc347
// https://atcoder.jp/contests/abc347/tasks/abc347_a
// AC:https://atcoder.jp/contests/abc347/submissions/52668961
fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val seq = readln().split(" ").map { it.toInt() }
    val out = mutableListOf<Int>()
    for (i in seq) {
        if (i % k == 0) {
            out.add(i / k)
        }
    }
    print(out.joinToString(separator = " "))
}