package abc343

fun main() {
    val s = readln().split(" ").map { it.toInt() }
    var i = 0
    while (s[0] + s[1] == i)
        i++
    print(i)
}