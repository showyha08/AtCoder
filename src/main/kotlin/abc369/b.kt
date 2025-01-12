package abc369

fun main() {
    val n = readln().toInt()
    var ans = 0
    var lp = 0
    var rp = 0
    var lc = 0
    var rc = 0
    repeat(n) {
        var (a, s) = readln().split(" ")
        val p = a.toInt()
        var x = 0
        if (s == "L") {
            x = Math.abs(p - lp)
            lp = p
            if (lc != 0)
                ans += x
            lc++
        } else {
            x = Math.abs(p - rp)
            rp = p
            if (rc != 0)
                ans += x
            rc++
        }
    }
    print(ans)
}

