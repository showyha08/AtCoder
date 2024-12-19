package abc383

fun main() {
    val (n, c1, c2) = readln().split(" ")
    val s = readln()
    for (c in s) {
        if (c.toString() != c1) {
            print(c2)
        } else {
            print(c)
        }
    }
}