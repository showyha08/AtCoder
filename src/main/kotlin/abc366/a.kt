package abc366

fun main() {
    // n基数
    val (n, t, a) = readln().split(" ").map { it.toInt() }
    val nokori = n - t - a
    if (t > a + nokori || a > t + nokori) {
        println("Yes")
        return
    }
    println("No")
}