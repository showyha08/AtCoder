package abc350

// WC
// 原因：0を含めてしまった
fun main() {
    val s = readln()
    val i = s.takeLast(3).toInt()
    if (i != 316 && i in 1 until 350) {
        print("Yes")
        return
    }
    print("No")
}