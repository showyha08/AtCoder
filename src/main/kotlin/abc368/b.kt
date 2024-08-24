package abc368

fun main() {
    val n = readln().toInt()
    var a = readln().split(" ").map { it.toInt() }.toMutableList()
    var ans = 0

    while (a.size != 1) {
        a.sort()
        a.reverse()
        if (a[1] <= 0) {
            break
        }
        a[0] -= 1
        a[1] -= 1
        ans++
    }
    print(ans)
}

