package abc344

fun main() {
    val out = ArrayDeque<Long>()
    out.add(readln().toLong())
    while (out.last() != 0L) {
        out.add(readln().toLong())
    }
    while (out.size > 1) {
        println(out.removeLast())
    }
    print(out.removeLast())
}