package abc350

fun main() {
    // 数列の最大値
    val n = readln().toInt() - 1
    // 数列
    val a = readln().split(" ").toMutableList()
    // 返却用
    val out = mutableListOf<Pair<String, String>>()

    // 現在値より小さい値があれば入れ替える
    for (i in 0..n) {
        // 現在値より小さい値の添字を見つける
        val targetNum = a[i]
        var lowNum = 0
        for (j in i+1..n) {
            if (a[j].toInt() < targetNum.toInt()  && a[j].toInt() < lowNum) {
                lowNum = a[j].toInt()
            }
        }

        // 見つかったら入れ替え
        if (lowNum != 0) {
            val lowIdx = a.indexOf(lowNum.toString())
            a[i] = lowNum.toString()
            a[lowIdx] = targetNum
            lowNum.let { out.add(targetNum to lowNum.toString()) }
        }
    }
    println(out.size)
    out.map { println(it.first + " " + it.second) }
}