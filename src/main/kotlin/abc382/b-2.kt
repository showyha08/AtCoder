package abc382

fun main() {
    val (n, d) = readln().split(" ").map { it.toInt() }
    val s = readln()
    val e = s.count { it == '@' } - d
    var cc = 0
    s.forEach { print(if (it == '@' && cc++ >= e) '.' else it) }
}
