package abc382

fun main() {
    var (n, m) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }
    val b = readln().split(" ").map { it.toInt() }
    val aMin = a.min()

    val aMap = mutableListOf<Pair<Int, Int>>()
    var min = Int.MAX_VALUE
    for (i in 0 until a.size) {
        if (a[i] < min) {
            aMap.add(Pair(a[i], i + 1))
            min = a[i]
        }
    }

    val bMap = mutableMapOf<Int, Int>()
    for (i in 0 until b.size) {
        bMap.put(i + 1, b[i])
    }
    val bSortedMap = bMap.toList().sortedByDescending { it.second }.toMap()

    var p = 0
    var ansMap = mutableMapOf<Int, Int>()
    for (bLevel in bSortedMap) {
        if (bLevel.value < aMin) {
            ansMap.put(bLevel.key, -1)
        } else {
            for (j in 0 + p until aMap.size) {
                if (aMap[j].first <= bLevel.value) {
                    ansMap.put(bLevel.key, aMap[j].second)
                    break
                }
                p++
            }
        }
    }
    print(ansMap.toList().sortedBy { it.first }.map { it.second }.joinToString("\n"))
}