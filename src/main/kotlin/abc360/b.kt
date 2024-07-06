package abc360

// atcoder acdr
fun main() {
    val (s, t) = readln().split(" ")

    for (i in 1..s.length - 1) {
        val sList = s.chunked(i)
        for (ii in 1..sList[0].length) {
            var ss = ""
            for (s in sList) {
                if (s.length > ii - 1) {
                    ss += s[ii - 1]
                }
            }
            if (ss == t) {
                println("Yes")
                return
            }
        }
    }
    println("No")
}
