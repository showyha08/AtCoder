package abc338

// WA:むずい。解説丸写し。

fun main() {
    val n = readln().toInt()
    val q = readln().split(" ").map { it.toLong() }
    val a = readln().split(" ").map { it.toLong() }
    val b = readln().split(" ").map { it.toLong() }
    val qmax = q.max()
    var ans = 0L
    for (x in 0..qmax) {
        var bmax = Long.MAX_VALUE
        for (i in 0 until q.size) {
            // このxは採用できない
            if (q[i] < a[i] * x) {
                bmax = Long.MIN_VALUE
                break
            } else if (b[i] > 0) {
                val _b = (q[i] - a[i] * x) / b[i]
                bmax = Math.min(bmax, _b)
            }
        }
        ans = Math.max(ans, x + bmax)
    }
    println(ans)
}
