package abc388

fun main() {
    val (n, d) = readln().split(" ").map { it.toInt() }
    val list: MutableList<Pair<Int, Int>> = mutableListOf()
    repeat(n) {
        val (t, l) = readln().split(" ").map { it.toInt() }
        list.add(Pair(t, l))
    }
    repeat(d) {
        var max = 0
        val cnt = it + 1
        for (p in list) {
            max = Math.max(p.first * (p.second + cnt), max)
        }
        println(max)
    }
}
