package abc364

fun isNotOver(xory: Int, worh: Int): Boolean {
    return 0 <= xory && xory < worh
}

fun main() {
    val (h, w) = readln().split(" ").map { it.toInt() }
    var (y, x) = readln().split(" ").map { it.toInt() - 1 }
    val map = mutableListOf<CharArray>()
    repeat(h) {
        val r = readln().toCharArray()
        map.add(r)
    }
    val command = readln()
    for (c in command) {
        if (c == 'U' && isNotOver(y - 1, h) && map[y - 1][x] == '.') {
            y -= 1
        }
        if (c == 'D' && isNotOver(y + 1, h) && map[y + 1][x] == '.') {
            y += 1
        }
        if (c == 'R' && isNotOver(x + 1, w) && map[y][x + 1] == '.') {
            x += 1
        }
        if (c == 'L' && isNotOver(x - 1, w) && map[y][x - 1] == '.') {
            x -= 1
        }
    }
    x++
    y++
    println("$y $x")
}
