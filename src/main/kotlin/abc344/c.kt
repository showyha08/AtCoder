package abc344

fun main() {
    val n = readln()
    val a = readln().split(" ").map { it.toInt() }
    val m = readln()
    val b = readln().split(" ").map { it.toInt() }
    val l = readln()
    val c = readln().split(" ").map { it.toInt() }
    val q = readln()
    val xx = readln().split(" ").map { it.toInt() }

    val p = mutableSetOf<Int>()

    for (x in a) {
        for (y in b) {
            for (z in c) {
                p.add(x + y + z)
            }
        }
    }

    for (i in 0 until xx.size) {
        if (p.contains(xx[i])) {
            println("Yes")
        } else {
            println("No")
        }
    }
}