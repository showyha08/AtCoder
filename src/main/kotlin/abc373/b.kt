package abc373

fun main() {
    val n = readln().toByteArray().map { it - 65 }
    var ans = 0
    for (i in 0..24) {
        val s = n.indexOf(i)
        val e = n.indexOf(i + 1)
        val dist = Math.abs(e - s)
        ans += dist
    }
    println(ans)
}
