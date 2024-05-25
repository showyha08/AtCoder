package abc340

fun main() {
    var (a, b, d) = readln().split(" ").map { it.toInt() }
    print(a)
    while (a != b) {
        a += d
        print(" $a")
    }
}