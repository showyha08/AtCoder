package abc347

fun main() {

    // ビーンズの種類
    val n = readln().toInt()

    // 色ごとのおいしさの最低値を求める
    val colorAndMinTasteMap = mutableMapOf<Int, Int>()
    for (i in 1..n) {
        // おいしさ, 色
        val (t, c) = readln().split(" ").map { it.toInt() }
        if (colorAndMinTasteMap[c] == null) {
            colorAndMinTasteMap[c] = 1000000000
        }
        if (colorAndMinTasteMap[c]!! > t) {
            colorAndMinTasteMap[c] = t
        }
    }

    // 一番大きいおいしさの値を探す
    val max = colorAndMinTasteMap.maxBy { it.value }
    print(max.value)
}