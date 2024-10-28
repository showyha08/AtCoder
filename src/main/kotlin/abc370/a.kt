package abc370

fun main() {
    val (l, r) = readln().split(" ").map { it.toInt() }
    if (l == 1 && r == 0) {
        print("Yes")
    } else if (l == 0 && r == 1) {
        print("No")
    } else {
        print("Invalid")
    }
}