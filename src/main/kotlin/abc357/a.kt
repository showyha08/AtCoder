package abc357

fun main() {
    var (n, m) = readln().split(" ").map { it.toInt() }
    val h = readln().split(" ").map { it.toInt() }
    var ans = 0
    for (i in 0 until n) {
        val hand = h[i]
        if (m - hand >= 0) {
            m -= hand
            ans++
        } else {
            break
        }
    }
    print(ans)
}