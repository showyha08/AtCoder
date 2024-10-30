package abc373

fun main() {
    var out = 0
    repeat(12) {
        val s = readln()
        if (it + 1 == s.length) {
            out++
        }
    }
    print(out)
}