package abc368

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }
    val ans = mutableListOf<Int>()
    for (i in n - k..n - 1) {
        ans.add(a[i])
    }
    for (i in 0..n - k - 1) {
        ans.add(a[i])
    }

    print(ans.joinToString(" "))

}