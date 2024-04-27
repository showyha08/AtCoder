package abc347

// https://atcoder.jp/contests/abc347/tasks/abc347_c

// 入力例 1 2 9 で 1週間が7日なら 2が休日なら9も休日になる
// 7日(1週間)の余りを求めて重複排除した後に休日がそのパターンで現れるかをみていく
// 入力例1. 1週間が7日(2休日5平日)で 1 2 9 の場合 1 2 となるので、休みが2日連続していれば良いことがわかる
// 平日最終日の場合は2日連続で休日がくるのでYes
// 入力例2. 1週間が15日(5休日10平日)で 10 15 の場合 0 10  となるので、休みが当日と10日後であれば良いことがわかる
// 5日休日最終日で10日後でも平日なのでNo

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