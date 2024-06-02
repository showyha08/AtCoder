package abc356

fun main() {
    var (n, l, r) = readln().split(" ").map { it.toInt() }
    l--
    r--
    val nl = mutableListOf<Int>()
    repeat(n) {
        nl.add(it + 1)
    }

    while (l < r) {
        val t = nl[l]
        nl[l] = nl[r]
        nl[r] = t
        l++
        r--
    }
    print(nl.joinToString(" "))
}