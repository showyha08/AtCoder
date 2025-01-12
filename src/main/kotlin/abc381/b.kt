package abc381

fun main() {
    val s = readln().toCharArray()
    val isLenOK = s.size % 2 == 0

    if (!isLenOK) {
        println("No")
        return
    }

    for (i in 0 until s.size / 2) {
        val ii = 2 * i
        val c = s.filter { it == s[ii] }.count()
        if (c != 2 || s[ii + 1] != s[ii]) {
            println("No")
            return
        }
    }

    println("Yes")
}
