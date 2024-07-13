package abc362

fun main() {
    val n = readln().toInt()
    val p = mutableListOf<Pair<Long, Long>>()
    val tl = mutableListOf<Long>()
    var t = 0L
    repeat(n)
    {
        val (l, r) = readln().split(" ").map { it.toLong() }
        tl.add(l)
        t += l
        p.add(Pair(l, r))
    }

    if (t > 0) {
        println("No")
        return
    }

    for (i in 0 until tl.size) {
        if (t != 0L) {
            // 最大限近づける
            val m = Math.min(p[i].second - p[i].first, -t)
            t += m
            tl[i] += m
        } else {
            break
        }
    }
    if (t == 0L) {
        println("Yes")
        print(tl.joinToString(" "))
    } else {
        println("No")
    }
}