package abc382

fun main() {
    var (n, d) = readln().split(" ").map { it.toInt() }
    val s = readln()
    var ans = ""
    for (i in s.length - 1 downTo 0) {
        val c = s[i]
        if (d > 0 && c == '@') {
            ans = ".$ans"
            d--
        } else {
            ans = "$c$ans"
        }
    }
    println(ans)
}
