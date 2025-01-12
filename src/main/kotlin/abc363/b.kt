package abc363

fun main() {
    val (n, t, p) = readln().split(" ").map { it.toInt() }
    var l = readln().split(" ").map { it.toInt() }

    var total = l.count { it >= t }
    var ans = 0
    while (total < p) {
        l = l.map { it + 1 }
        total = l.count { it >= t }
        ans++
    }
    println(ans)
}
