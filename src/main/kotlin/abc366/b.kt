package abc366

fun main() {
    val n = readln().toInt()
    val s = mutableListOf<CharArray>()
    var max = 0
    repeat(n) {
        val st = readln()
        s.add(st.toCharArray())
        max = Math.max(st.length, max)
    }
    val ans = mutableListOf<String>()
    for (y in 0 until max) {
        val charr = mutableListOf<Char>()
        for (x in n - 1 downTo 0 step 1) {
            // s[x][y]の先に文字があるなら*
            if (y > s[x].size - 1) {
                charr.add('*')
            } else {
                charr.add(s[x][y])
            }
        }
        while (charr.last() == '*'){
            charr.removeLast()
        }
        val str = charr.joinToString("")
        ans.add(str)
    }
    print(ans.joinToString("\n"))
}
