package abc343

fun main() {
    val n = readln().toInt()
    repeat(n) {
        val al = readln().split(" ").map { it.toInt() }
        val ansL = mutableListOf<Int>()
        for ((index, a) in al.withIndex()) {
            if (a == 1) {
                ansL.add(index + 1)
            }
        }
        println(ansL.joinToString(separator = " "))
    }
}