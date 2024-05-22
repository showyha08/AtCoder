package abc342

fun main() {
    val s = readln().toMutableList()
    for (i in 0 until s.size - 2) {

        if (s[i] != s[i + 1]) {
            // 真ん中
            if (s[i + 1] != s[i + 2]) {
                print(i + 2)
                return
            } else {
                // 左
                print(i + 1)
                return
            }
        }

        // 右
        if (s[i + 1] != s[i + 2]) {
            print(i + 3)
            return
        }

    }
}