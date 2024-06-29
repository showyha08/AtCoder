package abc359

fun main() {
    val n = readln().toInt()
    var ans = 0
    repeat(n) {
        val s = readln()
        if (s == "Takahashi")
            ans++
    }
    print(ans)
}