package abc352

fun main() {
    val n = readln().toInt()
    var total = 0L
    var diff = 0L
    var shoulder = 0L
    var head = 0L
    repeat(n) {
        val (a, b) = readln().split(" ").toMutableList().map { it.toLong() }
        total += a
        // 頭が一番大い巨人をさがす
        if (b - a > diff) {
            shoulder = a
            head = b
            diff = b - a
        }
    }
    total -= shoulder
    total += head
    print(total)
}

