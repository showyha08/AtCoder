package abc347

// https://atcoder.jp/contests/abc347/tasks/abc347_b
// https://atcoder.jp/contests/abc347/submissions/52700339
fun main() {
    val s = readln()
    val size = s.length
    val patternList = mutableListOf<String>()
    for (i in 0..size) {
        for (j in 1 + i..size) {
            val c = s.substring(i, j)
            if (!patternList.contains(c))
                patternList.add(c)
        }
    }
    print(patternList.size)
}