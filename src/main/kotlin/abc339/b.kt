package abc339

fun main() {
    val (h, w, n) = readln().split(' ').map { it.toInt() }
    val grid = MutableList(h) { MutableList(w) { '.' } }
    var i = 0
    var j = 0
    val d = ArrayDeque(listOf(1, 0, 0, 0))

    repeat(n) {
        // 方向転換
        if (grid[i][j] == '#') {
            val p = d.removeFirst()
            d.addLast(p)
            grid[i][j] = '.'
        } else {
            val p = d.removeLast()
            d.addFirst(p)
            grid[i][j] = '#'
        }

        // 動く
        when (d.indexOfFirst { it == 1 }) {
            0 -> i = (i - 1 + h) % h
            1 -> j = (j + 1 + w) % w
            2 -> i = (i + 1 + h) % h
            3 -> j = (j - 1 + w) % w
        }
    }

    print(grid.joinToString("\n") { it.joinToString("") })
}