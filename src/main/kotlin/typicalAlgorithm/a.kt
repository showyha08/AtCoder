package typicalAlgorithm

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }
    var l = -1
    var r = a.size
    var ans = -1

    if (a[r - 1] < k) {
        println(ans)
        return
    }

    while (l <= r) {
        var m = l + (r - l) / 2
        if (a[m] == k) {
            ans = m + 1
            break
        }
        if (a[m] < k) {
            ans = m + 1
            l = m + 1
        } else {
            r = m - 1
        }
    }
    println(ans)
}