package abc358

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val l = mutableListOf<Int>()
    repeat(n) {
        val s = readln()
            .replace("o", "1")
            .replace("x", "0")
            .toInt(radix = 2)
        l.add(s)
    }
    var ans = Int.MAX_VALUE
    for (i in 0 until (1 shl n)) {
        var popK = Integer.toBinaryString(i)
        var total = 0
        var c = 0
        while (popK.length > 0) {
            if (popK.last() == '1') {
                val t = total or (l[popK.length - 1])
                if (t > total) {
                    total = t
                    c++
                }
            }
            popK = popK.dropLast(1)
        }
        if (total.countOneBits() == m) {
            ans = Math.min(ans, c)
        }
    }
    print(ans)
}