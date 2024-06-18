package abc336

// 解説見てといたやつ
fun main() {
    var n = readln().toLong()
    n--
    var d = ""
    if (n == 0L) {
        print(0)
        return
    }
    while (n > 0) {
        d = (n % 5).toString() + d
        n /= 5
    }
    print(d.toLong() * 2)
}
