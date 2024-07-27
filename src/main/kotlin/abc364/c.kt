package abc364

fun main() {
    val (n, x, y) = readln().split(" ").map { it.toLong() }
    val a = readln().split(" ").map { it.toLong() }.toList().sortedDescending()
    val b = readln().split(" ").map { it.toLong() }.toList().sortedDescending()

    var sweet = 0L
    var solt = 0L
    var sweetCnt = n
    var soltCnt = n
    for ((index, s) in a.withIndex()) {
        sweet += s
        if (sweet > x) {
            sweetCnt = index + 1L
            break
        }
    }

    for ((index, s) in b.withIndex()) {
        solt += s
        if (solt > y) {
            soltCnt = index + 1L
            break
        }
    }
    println(Math.min(sweetCnt, soltCnt))
}