package abc341

// 解説を見て解いた。問題読解がむずい...
fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toLong() }
    val exchange = mutableListOf<Pair<Long, Long>>()
    repeat(n - 1) {
        val (s, t) = readln().split(" ").map { it.toLong() }
        exchange.add(s to t)
    }

    // 何回交換可能か
    var nextPlus = 0L
    for (i in 0 until exchange.size) {
        val cnt = (a[i] + nextPlus) / exchange[i].first
        nextPlus = cnt * exchange[i].second
    }

    print(a.last() + nextPlus)

}