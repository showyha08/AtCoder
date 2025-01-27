package abc368

// TIPS: 余りを利用しないこと、現在のターン数に応じた攻撃ができない

fun main() {

    val n = readln().toLong()
    val h = readln().split(" ").map { it.toLong() }
    var totalTarn = 0L
    for (i in h) {
        var tripleAttackCnt = i / 5L
        totalTarn += tripleAttackCnt * 3L
        var hp = i % 5

        while (hp > 0) {
            totalTarn++
            if (totalTarn % 3 == 0L) {
                hp -= 3
            } else {
                hp--
            }
        }
    }
    println(totalTarn)
}