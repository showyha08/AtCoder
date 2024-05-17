package abc345

fun main() {
    val n = readln().toCharArray()

    if (n[0] != '<') {
        print("No")
        return
    }

    if (n[n.size - 1] != '>') {
        print("No")
        return
    }

    for (i in 1 until n.size - 1) {
        if (n[i] != '=') {
            print("No")
            return
        }
    }

    print("Yes")

}