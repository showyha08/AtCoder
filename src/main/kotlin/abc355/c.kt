package abc355

import kotlin.math.max
import kotlin.math.min

fun main() {
    val (n, t) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() - 1 } //-1しておく添字で管理しやすくする
    val board = MutableList(n) { MutableList(n) { Int.MAX_VALUE } }

    // ターン数を書き込む
    for ((i, c) in a.withIndex()) {
        val x = c / n
        val y = c % n // 順番を逆にしても横が揃ってれば良いので問題ない
        board[x][y] = i + 1
    }

    var ans = Int.MAX_VALUE

    // 横
    for (i in 0 until n) {
        var max = 0
        for (j in 0 until n) {
            // ビンゴしてない場合は最大値がそのまま入る
            max = max(max, board[i][j])
        }
        // ビンゴしている場合は更新される
        ans = min(ans, max)
    }

    // 縦
    for (j in 0 until n) {
        var max = 0
        for (i in 0 until n) {
            max = max(max, board[i][j])
        }
        ans = min(ans, max)
    }

    // 斜め
    var ijMax = 0
    for (ij in 0 until n) {
        ijMax = max(ijMax, board[ij][ij])
    }
    ans = min(ans, ijMax)

    // 斜め
    var jiMax = 0
    for (ij in 0 until n) {
        jiMax = max(jiMax, board[ij][n - ij - 1])
    }
    ans = min(ans, jiMax)

    if (ans == Int.MAX_VALUE) {
        print(-1)
    } else {
        print(ans)
    }
}
