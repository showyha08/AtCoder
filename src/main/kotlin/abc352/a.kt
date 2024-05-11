package abc352

// https://atcoder.jp/contests/abc352/tasks/abc352_a
fun main() {
    val a = readln().split(" ").map { it.toInt() }.toMutableList()
    val isUp = a[1] < a[2]
    val s = a[3]
    if (isUp) {
        if (a[1] <= s && s <= a[2]) {
            println("Yes")
        } else {
            println("No")
        }
    } else {
        if (a[2] <= s && s <= a[1]) {
            println("Yes")
        } else {
            println("No")
        }
    }
}