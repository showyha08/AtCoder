package abc355

fun main() {
    readln()
    val a = readln().split(" ").toMutableList().map { it.toInt() }
    val b = readln().split(" ").toMutableList().map { it.toInt() }
    val c = (a + b).sorted()
    var cnt = 0
    for (i in c) {
        if (a.contains(i)) {
            cnt++
            if (cnt == 2) {
                print("Yes")
                return
            }
        } else {
            cnt = 0
        }
    }
    print("No")
}
