package abc340

// メモ化再起
var memo = mutableMapOf<Long, Long>()

fun splitNum(i: Long): Long {
    var ans = 0L
    if (i in memo) {
        return memo[i]!!
    }

    if (2 <= i) {
        val divide1 = i / 2
        val divide2 = (i + 1) / 2
        val divide1Result = splitNum(divide1)
        val divide2Result = splitNum(divide2)
        ans = i + divide1Result + divide2Result
        memo[i] = ans
        return ans
    } else {
        return ans
    }
}

fun main() {
    val n = readln().toLong()
    val ans = splitNum(n)
    println(ans)
}
