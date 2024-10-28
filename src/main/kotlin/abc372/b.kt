package abc372

fun main() {
    val n = readln().toDouble()
    var sum = 0.toDouble()
    val list = mutableListOf<Double>()
    while (sum != n) {
        sum = 0.toDouble()
        for (i in 0..10) {
            list.add(Math.pow("3".toDouble(), i.toDouble()))
            if (list.sum() >= n) {
                break
            }
        }
        sum = list.sum()
    }
}
