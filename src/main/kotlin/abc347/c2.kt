package abc347

import java.io.File
import java.util.*

fun main() {
    val file = File("./01_test_41.txt") // 入力ファイルのパスを指定します
    val scanner = Scanner(file)

    // 1行目の入力を読み取り、n, a, bの値を取得します
    val n = scanner.nextInt()
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    // 2行目の入力を読み取り、dリストを生成します
    val d = mutableListOf<Int>()
    repeat(n) {
        d.add(scanner.nextInt() % (a + b))
    }
    d.sort()
    d.distinct()

    scanner.close() // Scannerを閉じます

    // 1週のみで考えた場合
    if (d.last()-d.first() < a ) {
        println("Yes")
        return
    }

    // 2週またぐケースを考慮
    val d2 = d + d.toMutableList().map { it + a + b }
    // 予定の間隔が休日に収まっていればOK
    for (i in 0 until d.size) {
        if ( d2[i + d.size - 1] - d2[i] < a) {
            println("Yes")
            return
        }
    }
    println("No")
}