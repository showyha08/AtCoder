package abc341

// 2次元配列で考えると良い、はじめは文字列で考えてうまくいかなかった
fun main() {
    val (h, w, n) = readln().split(" ").map { it.toInt() }
    val t = readln().toCharArray()
    val s = Array(h) { CharArray(w) }
    repeat(h) {
        s[it] = readln().toCharArray()
    }

    // O(HWN)
    var ans = 0
    for (i in 1 until h) {
        for (j in 1 until w) {
            if (s[i][j] == '#') {
                continue
            }
            var I = i
            var J = j
            var ok = true
            for (c in t) {
                when (c) {
                    'U' -> I--
                    'D' -> I++
                    'L' -> J--
                    'R' -> J++
                }
                if (s[I][J] == '#') {
                    ok = false
                    break
                }
            }
            if (ok) {
                ans++
            }
        }
    }
    print(ans)
}
