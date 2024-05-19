package abc354

fun main() {
    val n = readln().toInt()
    val p = mutableListOf<String>()
    var total = 0;
    for (i in 0 until n) {
        val a = readln().split(" ")
        p.add(a[0])
        total += a[1].toInt()
    }
    p.sort()
    val mod = total % n
    print(p[mod])
}