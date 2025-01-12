package abc377

fun main() {
    val S = List(8) { readln() }
    var xCnt = 0
    var yCnt = 0
    for (s in S) {
        if (s.find { it == '#' } != '#') {
            xCnt++
        }
    }
    for (i in 0..7) {
        var y = ""
        for (s in S) {
            y += s[i]
        }
        if (y.find { it == '#' } != '#') {
            yCnt++
        }
    }
    println(xCnt * yCnt)
}
