fun main() {
    val k = readln()
    val s = readln()
    val t = readln()

    if (s == t) {
        println("Yes")
        return
    }

    if (s.length == t.length) {
        var diffCnt = 0
        for (i in 0 until s.length) {
            if (s[i] != t[i]) {
                diffCnt++
            }
        }
        if (diffCnt == 1) {
            println("Yes")
            return
        }
    }

    if (s.length == t.length + 1) {
        var diffCnt = 0
        for (i in 0 until s.length) {
            if (i < t.length && i + diffCnt < s.length && s[i + diffCnt] != t[i]) {
                diffCnt++
                if (diffCnt == 1 && s[i + diffCnt] == t[i]) {
                    continue
                }
            }
            if (diffCnt > 1) {
                println("No")
                return
            }
        }
        println("Yes")
        return
    }

    if (s.length + 1 == t.length) {
        var diffCnt = 0
        for (i in 0 until t.length) {
            if (i < s.length && i + diffCnt < t.length && t[i + diffCnt] != s[i]) {
                diffCnt++
                if (diffCnt == 1 && t[i + diffCnt] == s[i]) {
                    continue
                }
            }
            if (diffCnt > 1) {
                println("No")
                return
            }
        }
        println("Yes")
        return
    }
    println("No")
}