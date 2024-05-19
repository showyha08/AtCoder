package abc349

fun main() {
    val s = readLine()!!
    val counts = s.groupBy { it }.map { it.value.size }
    println(if (counts.groupBy { it }.map { it.value.size }.all { it == 2 }) "Yes" else "No")
}