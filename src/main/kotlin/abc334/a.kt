package abc334

fun main() {
    val (b, g) = readln().split(" ").map { it.toInt() }
    if (b > g) {
        print("Bat")
    } else {
        print("Glove")
    }
}