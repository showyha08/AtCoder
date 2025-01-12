package abc367

fun main() {
    // bねる、cおきる
    val (a, b, c) = readln().split(" ").map { it.toInt() }

    if (b < c) {
        if (a in b..c) {
            print("No")
        } else {
            print("Yes")
        }
    } else {
        if (a in c..b) {
            print("Yes")
        } else {
            print("No")
        }
    }
}