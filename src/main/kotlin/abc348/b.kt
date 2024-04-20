package abc348

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    // 点の数
    val n = readln().toInt()

    // 座標一覧
    val xy = mutableListOf<Pair<Int, Int>>()
    for (i in 1..n) {
        // 座標を取得
        val (x, y) = readLine()?.split(" ")!!.map { it.toInt() }
        xy.add(Pair(x, y))
    }

    // 一番遠い点を探しながら返却値を格納
    val out = IntArray(n)
    for ((index, i) in xy.withIndex()) {
        var distance = 0.0
        var farthest = 0
        for (j in xy) {
            val st = (i.first - j.first).toDouble().pow(2.0)
            val ed = (i.second - j.second).toDouble().pow(2.0)
            val dist = sqrt(st + ed)
            if (distance < dist) {
                distance = dist
                farthest = xy.indexOfFirst { it == j }
            }
        }
        out[index] = farthest
    }

    for (o in out) {
        println(o + 1)
    }
}