package abc352

// AC
// https://atcoder.jp/contests/abc352/tasks/abc352_b
fun main() {
    val n = readln().toMutableList()
    val t = readln().toMutableList()
    val b = mutableListOf<Int>()
    var next = 0

    for (i in 0 until n.size) {
        for (j in next until t.size) {
            if (n[i] == t[j]) {
                b.add(j + 1)
                next = j+1
                break
            }
        }
    }

    print(b.joinToString(separator = " "))
}