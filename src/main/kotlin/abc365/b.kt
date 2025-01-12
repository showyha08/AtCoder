package abc365

fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }
    val second = a.sortedDescending()[1]
    val i = a.mapIndexed { index, i -> Pair(index, i) }.firstOrNull { second == it.second }?.first?:0
    print(i+1)
}
