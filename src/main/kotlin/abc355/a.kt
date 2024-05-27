package abc355

fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    if (a == b) {
        print(-1)
        return
    }
    repeat(3) {
        val i = it + 1
        if (a != i && b != i) {
            print(i)
            return
        }
    }
}