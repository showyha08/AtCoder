package abc353

fun main() {
    val n = readln().toInt()
    val h = readln().split(" ").map { it.toInt() }.toMutableList().sorted()
    var total = 0L
    var cnt = 0L
    val s = n - 1
    var r = s
    val max = 100000000

    for (i in 0..s - 1) {
        // 10^8以下になるまで末尾の目印を進める、iとrの関係は逆転しないこと
        while (h[i] + h[r] >= max && i < r) {
            r--
        }
        // 今いる配列の添字より右側は必ず10000000を超えるので、配列のサイズとの差をとって加算する
        if (i >= r) {
            // 逆転している場合は今見ている地点から末尾までは全て10000000を超える
            cnt += s - i
        } else {
            cnt += s - r
        }
    }

    for (i in 0..s) {
        total += h[i].toLong() * (n - 1)
    }

    print(total - (cnt * 100000000L))
}
