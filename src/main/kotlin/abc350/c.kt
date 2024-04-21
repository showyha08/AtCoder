package abc350

fun main() {
    // 数列の最大値
    val n = readln().toInt()
    // 数列
    val a = readln().split(" ").map { it.toInt() - 1 }.toMutableList()
    // 数字の格納先一覧を作る (実行時間制限対策)
    val p = IntArray(n)
    // 格納先一覧は0始まりに注意
    for ((index, i) in a.withIndex()) {
        p[i] = index
    }
    // 返却用リスト
    val ret = mutableListOf<Pair<Int, Int>>()

    // 1から最大値まで
    for (i in 0 until n) {
        // 添字と中の数字が一致してない場合は入れ替え
        if (a[i] != i) {
            ret.add(i + 1 to p[i] + 1) // 0始まりで考えてたので戻す、最初に追加しておく必要がある
            val t = a[i]
            a[i] = i
            a[p[i]] = t
            // 一覧も更新
            val t2 = p[i]
            p[i] = i
            p[t] = t2
        }
    }

    // 出力
    println(ret.size)
    ret.map { println("${it.first} ${it.second}") }
}

// 時間切れの書き方。。。
//fun main() {
//    // 数列の最大値
//    val n = readln().toInt()
//    // 数列
//    val a = readln().split(" ").map { it.toInt() }.toMutableList()
//    // 返却用
//    val ret = mutableListOf<Pair<Int, Int>>()
//
//    // 現在値より小さい値があれば入れ替える
//    for (i in 0 until n) {
//        // 数列の中で現在値より右側で小さい値(最小値)を見つける
//        val targetNum = a[i]
//        var lowNum = n
//        for (j in i + 1 until n) {
//            if (a[j] < targetNum && a[j] < lowNum) {
//                lowNum = a[j]
//            }
//        }
//
//        // 見つかったら入れ替え
//        if (lowNum != n) {
//            val lowIdx = a.indexOf(lowNum)
//            a[i] = lowNum
//            a[lowIdx] = targetNum
//            lowNum.let { ret.add(lowNum to targetNum) }
//        }
//    }
//
//    // 出力
//    println(ret.size)
//    ret.map { println("${it.first} ${it.second}") }
//}