package abc356

fun main() {
    val (n, m) = readln().split(" ").toMutableList().map { it.toInt() }
    val a = readln().split(" ").toMutableList().map { it.toInt() }
    val total = MutableList(100) { 0 }
    repeat(n) {
        val x = readln().split(" ").toMutableList().map { it.toInt() }
        for (i in 0 until a.size) {
            total[i] += x[i]
        }
    }
    for (j in 0 until a.size) {
        if (total[j] < a[j]) {
            print("No")
            return
        }
    }
    print("Yes")
}
