package abc361


// 失敗考察：3次元空間の中に点が入っていればヨシ。
// 正しい考察：1次元でまずは考える。普通にGoogleで3Dゲームの当たり判定について検索すべきだった。

fun main() {
    val a = readln().split(" ").map { it.toInt() }
    val g = readln().split(" ").map { it.toInt() }

    // xyz で重ならないとき
    val isNotXover = a[3] <= g[0] || g[3]<= a[0]
    val isNotYover = a[4] <= g[1] || g[4]<= a[1]
    val isNotZover = a[5] <= g[2] || g[5]<= a[2]
    if (!isNotXover && !isNotYover && !isNotZover) {
        print("Yes")
    } else {
        print("No")
    }
}
