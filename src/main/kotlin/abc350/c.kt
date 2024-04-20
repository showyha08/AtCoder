package abc350

fun main() {
    // 数列の最大値
    val n = readln().toInt()
    // 数列
    val a = readln().split(" ").map { it.toInt() }.toMutableList()
    // 返却用
    val ret = mutableListOf<Pair<Int, Int>>()

    // 現在値より小さい値があれば入れ替える
    for (i in 0 until n) {
        // 数列の中で現在値より右側で小さい値(最小値)を見つける
        val targetNum = a[i]
        var lowNum = n
        for (j in i + 1 until n) {
            if (a[j] < targetNum && a[j] < lowNum) {
                lowNum = a[j]
            }
        }

        // 見つかったら入れ替え
        if (lowNum != n) {
            val lowIdx = a.indexOf(lowNum)
            a[i] = lowNum
            a[lowIdx] = targetNum
            lowNum.let { ret.add(lowNum to targetNum) }
        }
    }

    // 出力
    println(ret.size)
    ret.map { println("${it.first} ${it.second}") }
}