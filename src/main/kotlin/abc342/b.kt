package abc342

fun main() {
    readln().toInt()
    val p = readln().split(" ").map { it.toInt() }
    val q = readln().toInt()
    repeat(q) {
        val (l, r) = readln().split(" ").map { it.toInt() }
        val li = p.indexOf(l)
        val ri = p.indexOf(r)
        println(
            if (li < ri) {
                l
            } else {
                r
            }
        )
    }
}