package abc374

fun main() {
    val s = readln()
    val t = readln()
    if (s == t) {
        println(0)
    } else {
        val rep = Math.min(s.length, t.length)
        repeat(rep) {
            if (t[it] != s[it]) {
                println(it + 1)
                return
            }
        }
        println(rep + 1)
        return
    }
}
