package abc340

fun main() {
    val n = readln().toInt()
    val ans = mutableListOf<Int>()
    repeat(n) {
        val (q, xORk) = readln().split(" ").map { it.toInt() }
        if (q == 1) {
            ans.add(xORk)
        } else {
            println(ans[ans.size - xORk])
        }
    }
}