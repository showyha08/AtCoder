package abc371

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val mans = Array(n) { false }
    repeat(m) {
        val (a, b) = readln().split(" ")
        val aint = a.toInt() - 1
        if (mans[aint] == false && b == "M") {
            println("Yes")
        } else {
            println("No")
        }
        if (b == "M") {
            mans[aint] = true
        }
    }
}
