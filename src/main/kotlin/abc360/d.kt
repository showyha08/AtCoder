package abc360

// 解説みて解いたやつ
fun main() {
    val (n, t) = readln().split(" ").map { it.toLong() }
    val s = readln()
    val x = readln().split(" ").map { it.toLong() }
    val rigthAnts = mutableListOf<Long>()
    val leftAnts = mutableListOf<Long>()
    repeat(n.toInt()) {
        if (s[it] == '1') {
            rigthAnts.add(x[it])
        } else {
            leftAnts.add(x[it])
        }
    }
    rigthAnts.sort()
    leftAnts.sort()
    var l = 0
    var r = 0
    var ans = 0L
    for (i in 0 until rigthAnts.size) {
        while (l < leftAnts.size && leftAnts[l] < rigthAnts[i]) l++
        while (r < leftAnts.size && leftAnts[r] <= rigthAnts[i] + t * 2) r++
        ans += r - l
    }
    println(ans)
}