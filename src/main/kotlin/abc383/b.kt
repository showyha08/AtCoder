package abc383

fun main() {
    var (n, r) = readln().split(" ").map { it.toInt() }
    repeat(n) {
        val (d, a) = readln().split(" ").map { it.toInt() }
        val isD1Range = r in 1600..2799
        val isD2Range = r in 1200..2399
        if (d == 1 && isD1Range) {
            r += a
        }
        if (d == 2 && isD2Range) {
            r += a
        }
    }
    print(r)
}
