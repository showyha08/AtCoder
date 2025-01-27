package abc390

fun main() {
    val x = readln().split(" ").map { it.toInt() }
    var cnt = 1
    var diff = 0
    for (i in 0 until 4) {
        if (x[i] != cnt && x[i + 1] != cnt + 1) {
            diff++
        }
        cnt++
    }
    if (diff == 1) {
        println("Yes")
    } else {
        println("No")
    }
}