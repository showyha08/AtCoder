package abc337

// AC:解説見ずにとけて嬉しい
fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }
    val ans = mutableListOf<Int>()
    val aa = mutableMapOf<Int, Int>()

    for ((index, i) in a.withIndex()) {
        aa[i] = index + 1
    }

    var s = -1
    repeat(n) {
        s = aa[s]!!
        ans.add(s)
    }
    print(ans.joinToString(" "))
}
