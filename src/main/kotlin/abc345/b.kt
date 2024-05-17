package abc345

fun main() {
    val x = readln().toLong()
    print(
        if (x < 0 || x.mod(10) == 0) {
            x / 10
        } else {
            x / 10 + 1
        }
    )
}