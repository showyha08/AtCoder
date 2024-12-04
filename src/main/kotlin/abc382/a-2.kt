package abc382

// 完結な回答
// 空き箱から考えた方が簡単
//fun main() {
//    val (n, d) = readln().split(" ").map { it.toInt() }
//    println(d + readln().count { it == '.' })
//}

fun main() {
    print(readln().split(' ')[1].toInt() + readln().count { it == '.' })
}