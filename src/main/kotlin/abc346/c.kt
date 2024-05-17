package abc346

// https://atcoder.jp/contests/abc346/tasks/abc346_c

fun main() {
    val (n, k) = readln().split(" ").map { it.toLong() }
    val a = readln().split(" ").map { it.toLong() }.distinct().sorted()
    var cnt = 0L

    for (i in a) {
        if (i <= k) {
            cnt += i
        } else {
            break
        }
    }

    var kaijo = 0L
    for (i in 1..k) {
        kaijo += i
    }

    print(kaijo - cnt)

}