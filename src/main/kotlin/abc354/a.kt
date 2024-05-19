package abc354

fun main() {
    val h = readln().toDouble()
    var p = 1.toDouble()
    var day = 1.toDouble()
    while (p <= h) {
        p += Math.pow(2.toDouble(), day)
        day++
    }
    print(day.toLong())
}