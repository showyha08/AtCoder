package abc388

fun main() {
    val n = readln().toLong()
    val a = readln().split(" ").map { it.toLong() }
    val b = a.filter { it <= (a.last() / 2) }
    var bp = b.size - 1

    if (bp == -1) {
        println(0)
        return
    }

    val start = a[bp]
    var ans = 0L
    val aa = ArrayDeque(a)

    while (true) {
        val harfP = aa.removeLast() / 2
        while (a[bp] > harfP && 0 < bp) {
            bp--
        }
        if (a[bp] <= harfP)
            ans += bp + 1
        if (aa.size == 0 || bp == 0 && aa.last() <= 1)
            break
    }
    println(ans)
}