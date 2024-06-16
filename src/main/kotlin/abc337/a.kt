package abc337

fun main() {
    val n = readln().toInt()
    var x = 0
    var y = 0
    repeat(n) {
        val xy = readln().split(" ").map { it.toInt() }
        x += xy[0]
        y += xy[1]
    }
    if (x > y) {
        print("Takahashi")
    } else if (x == y) {
        print("Draw")
    } else {
        print("Aoki")
    }
}