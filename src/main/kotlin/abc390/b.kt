package abc390

fun main() {
    val n = readln().toDouble()
    val a = readln().split(" ").map { it.toDouble() }
    val kouhi = a[1] / a[0]

    for (i in 0 until a.size - 1) {
        if (a[i] * kouhi != a[i + 1]) {
            println("No")
            return
        }
    }
    println("Yes")
}
