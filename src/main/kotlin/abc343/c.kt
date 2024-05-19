package abc343

fun main() {
    val n = readln().toLong()
    var c = 1L
    var ccc = 1L
    var ans = 1L
    while (true) {
        ccc = c * c * c

        if (ccc > n)
            break

        val s = ccc.toString()
        val sr = s.reversed()
        if (s == sr) {
            ans = ccc
        }
        c++
    }
    print(ans)
}