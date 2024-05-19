package abc354

// WA
// 解説をみながら解いた

fun main() {
    val n = readln().toInt()
    val cList = mutableListOf<Triple<Int, Int, Int>>()
    for (i in 0 until n) {
        val card = readln().split(" ")
        cList.add(Triple(card[0].toInt(), card[1].toInt(), i + 1))
    }
    // Cost順
    cList.sortBy { it.second }
    val ans = mutableListOf<Int>()
    var max = 0
    for (c in cList) {
        // Aを更新
        if (max < c.first) {
            max = c.first
            ans.add(c.third)
        }
    }
    ans.sort()
    println(ans.size)
    print(ans.joinToString(separator = " "))
}
