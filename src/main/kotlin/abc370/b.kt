package abc370

fun main() {
    val n = readln().toInt()
    var ans = 1
    val table: MutableList<List<Int>> = mutableListOf()
    repeat(n) {
        val row = readln().split(" ").map { it.toInt() }
        table.add(row)
    }
    repeat(n) {
        if (it >= ans) {
            ans = table[it][ans-1]
        } else {
            ans = table[ans-1][it]
        }
    }
    println(ans)
}
