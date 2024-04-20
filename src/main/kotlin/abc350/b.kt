package abc350

// AC
fun main() {
    // 歯, 治療回数
    val (n) = readln().split(" ")

    // 対象
    val t = readln().split(" ")

    // 全部の歯をはやす
    val nArr = BooleanArray(n.toInt()) { true }

    // 治療毎に正負を変える
    for (i in t) {
        val j = i.toInt() - 1
        nArr[j] = !nArr[j]
    }

    // 歯の数を返す
    print(nArr.count { it })
}