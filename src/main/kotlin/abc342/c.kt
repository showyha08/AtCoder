package abc342

// 根付き森
fun main() {
    readln()
    val s = readln().toMutableList()
    val q = readln().toInt()
    val ab = "abcdefghijklmnopqrstuvwxyz"
    var aa = ab
    // O(n)
    repeat(q) {
        val (c, d) = readln().split(" ")
        aa = aa.replace(c, d)
    }
    val abl = ab.toCharArray()
    val aal = aa.toCharArray()
    val replaceMap = mutableMapOf<Char, Char>()
    // O(26)
    for ((i, a) in abl.withIndex()) {
        replaceMap[a] = aal[i]
    }

    // O(n)
    val ans = mutableListOf<Char>()
    for (i in 0 until s.size) {
        ans += replaceMap[s[i]]!!
    }
    print(ans.joinToString(""))
}
