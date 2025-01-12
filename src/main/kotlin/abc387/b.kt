package abc387

fun main() {
    val x = readln().toInt()
    var ans = 0
    for (i in 1..9) {
        for (j in 1..9) {
            val a = i * j
            if (a != x)
                ans += i * j
        }
    }
    println(ans)
}
