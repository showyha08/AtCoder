package abc369

fun main() {
    val (p, q) = readln().split(" ").map { it.toInt() }
    var ans = 0
    for (r in -100..200) {
        val l = mutableListOf(p, q, r).sorted()
        if (l[1] - l[0] == l[2] - l[1]) {
            ans++
        }
    }
    println(ans)
}