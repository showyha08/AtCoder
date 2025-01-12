package abc365

fun main() {
    val n = readln().toInt()
    val is4m = n % 4 == 0
    val is100m = n % 100 == 0
    val is400m = n % 400 == 0
    val ans = if (!is4m) {
        365
    } else if (
        !is100m
    ) {
        366
    } else if (
        !is400m
    ) {
        365
    } else {
        366
    }
    print(ans)

}