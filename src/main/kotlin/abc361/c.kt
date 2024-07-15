package abc361

// 失敗理由1：forの終点の認識誤り。
// 失敗理由2：sliceを利用した(TLE)。はじめと終わりだけ利用すれば良いのでsliceを使うほどでは無い。直接index指定で取得すれば良い.
fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }.toMutableList().sorted()
    var m = Int.MAX_VALUE

    for (i in 0..k) {
        val l = a[i + n - k - 1] - a[i]
        m = Math.min(l, m)
    }

    print(if (m == Int.MAX_VALUE) 0 else m)
}