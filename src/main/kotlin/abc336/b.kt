package abc336

fun main() {
    var s = readln().toInt()
    val b = mutableListOf<Int>()

    while (0 < s) {
        b.add(s % 2)
        s /= 2
    }

    for (i in 0 until b.size) {
        if (b[i] != 0) {
            print(i)
            return
        }
    }
    print(0)
}