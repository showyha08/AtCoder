package abc361

fun main() {
    val (n, k, x) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }.toMutableList()
    a.add(k, x)
    print(a.joinToString(" "))
}