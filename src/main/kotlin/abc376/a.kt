package abc376

fun main() {
    val (n, c) = readln().split(" ").map { it.toInt() }
    val s = readln().split(" ").map { it.toInt() }
    var last = s.first()
    var ans = 1
    for (i in 1 until s.size) {
        if (s[i] >= last + c) {
            ans++
            last = s[i]
        }
    }
    println(ans)
}