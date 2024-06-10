package abc357


fun main() {
    val n = readln().toDouble()
    val nn = Math.pow(3.0, n)
    val ans: MutableList<MutableList<Char>> = mutableListOf()
    var x = 1
    var y = 1
    var r = nn.toInt()
    repeat(r) {
        val row = mutableListOf<Char>()
        repeat(r) {
            if (x % 3 == 2 && y % 3 == 2
                || check(n, x, y)
            ) {
                row.add('.')
            } else {
                row.add('#')
            }
            x++
        }
        ans.add(row)
        y++
        x = 1
    }
    print(ans.joinToString("\n") { it.joinToString("") })
}

fun check(n: Double, x: Int, y: Int): Boolean {
    var n1 = n
    while (n1 - 1 > 0) {
        val a = Math.pow(3.0, n1)
        n1--
        val b = Math.pow(3.0, n1)
        if (b < x && x <= a - b && b < y && y <= a - b
            || (b < x % a && x % a <= a - b && b < y && y <= a - b)
            || (b < x && x <= a - b && b < y % a && y % a <= a - b)
            || (b < x % a && x % a <= a - b && b < y % a && y % a <= a - b)
        ) {
            return true
        }
    }
    return false
}