package abc335

fun main() {
    val (n, q) = readln().split(" ").map { it.toInt() }

    val xy = ArrayDeque<Pair<Int, Int>>()
    repeat(n) {
        xy.add(Pair(it + 1, 0))
    }

    repeat(q) {
        val (q1, q2) = readln().split(" ")
        if (q1 == "1") {
            xy.removeLast()
            val f = xy.first()
            when (q2) {
                "U" -> xy.addFirst(Pair(f.first, f.second + 1))
                "R" -> xy.addFirst(Pair(f.first + 1, f.second))
                "D" -> xy.addFirst(Pair(f.first, f.second - 1))
                "L" -> xy.addFirst(Pair(f.first - 1, f.second))
            }
        } else {
            println(xy[q2.toInt() - 1].toList().joinToString(" "))
        }
    }
}
