package abc337

fun main() {
    val s = readln().toMutableList()
    val isABC = s.all { it == 'A' || it == 'B' || it == 'C' }
    if (isABC) {
        val ss = s.sorted()
        if (ss == s)
            print("Yes")
        else
            print("No")
    } else {
        print("No")
    }
}