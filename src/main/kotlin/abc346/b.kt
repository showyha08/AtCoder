package abc346

// https://atcoder.jp/contests/abc346/tasks/abc346_b
fun main() {
    val (w, b) = readln().split(" ").map { it.toInt() }
    val subStringLen = w + b
    val rep = subStringLen / 7
    val piano = buildString {
        repeat(rep+1) {
            append("wbwbwwbwbwbw")
        }
    }

    for (i in 0 until piano.length - subStringLen) {
        var wc = 0
        var wb = 0
        for (j in 0..subStringLen) {
            val t = i + j
            if (piano[t] == 'w') {
                wc++
            } else {
                wb++
            }
            if (wc == w && wb == b) {
                print("Yes")
                return
            }
        }
    }
    print("No")
}