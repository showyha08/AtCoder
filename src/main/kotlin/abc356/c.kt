package abc356

//WA bit全探索 問題
fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    val pattern = 1 shl n
    val pList = mutableListOf<Pair<Int, Boolean>>()
    repeat(m) {
        val a = readln().split(" ")
        pList.add(
            Pair(
                // bitで考える
                a.subList(1, a.size - 1).map { 1 shl (it.toInt() - 1) }.sum(),
                a.last() == "o"
            )
        )

    }
    var ans = 0
    for (i in 0 until pattern) {
        var ok = true
        for (p in pList) {
            if (p.second) {
                // oの場合 andでk以上ならOK、逆ならng
                if ((p.first and i).countOneBits() < k) {
                    ok = false
                    break
                }
            } else {
                // xの場合 andで同じ数を維持しているなら除外
                if ((p.first and i).countOneBits() >= k) {
                    ok = false
                    break
                }
            }
        }
        if (ok) ans++
    }
    println(ans)
}
