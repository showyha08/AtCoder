package abc376

// 考えること
// ・時計回り、反時計回りの２パターンがある
// ・２パターンのうち近い方を採用する
// ・L,Rはそれぞれ追い越せない
// ・円環　例：サイズ6の場合、1と6が隣り合う
// ヒント
// ・時計回りの経路+反時計回りの経路＝周期
// ・問題の読み替え「ng を通らないようにfrom から to まで行く移動回数の最小値は？」
// 解き方
// ・indexを貼り直す

fun main() {
    val (n, q) = readln().split(" ").map { it.toInt() }
    var (l, r) = Pair(1, 2)
    var ans = 0
    repeat(q) {
        val (h, t) = readln().split(" ")
        val goal = t.toInt()
        // indexを貼りなおす方針
        if (h == "R") {
            val ng = (l - r).mod(n) // Rが大きい場合にマイナスになるのでサイズから余りをとる(%であまりを求めるのはダメ
            val to = (goal - r).mod(n) // サイズ6の場合 0 ~ 5になる
            // L が 目標地点 より 小さい場合は追い越すことになり時計周りできないので反時計回り
            if (ng < to) {
                // 反時計周りでの距離 (周期から時計回りの距離を引けば良い)
                ans += n - to
            } else {
                // 時計周り
                ans += to
            }
            r = goal
        } else {
            val ng = (r - l).mod(n)
            val to = (goal - l).mod(n)
            if (ng < to) {
                ans += n - to
            } else {
                ans += to
            }
            l = goal
        }
    }
    println(ans)
}
