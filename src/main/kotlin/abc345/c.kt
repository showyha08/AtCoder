package abc345

fun main() {
    val s = readln()
    var ans = 0L
    val cMap = mutableMapOf<Char, Int>()
    for ((i, c) in s.withIndex()) {
        // ループ回数からいままで登場した同じ文字の回数を引いたものを足していく
        ans += i - cMap.getOrPut(c) { 0 }
        // 登場回数を加算
        cMap[c] = cMap.getOrPut(c) { 1 } + 1
    }
    val samePattern = cMap.filterValues { it > 1 }.isNotEmpty()
    print(ans + if (samePattern) 1 else 0)
}