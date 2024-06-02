package abc356

//WA bit全探索 問題
fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    val rows = 15
    val cols = 15
    val alist: MutableList<List<String>> = MutableList(rows) {
        MutableList(cols) { "" }
    }
    repeat(m) {
        alist.add(readln().split(" "))
    }

    var total1 = n
    var i = n - 1
    repeat(k) {
        total1 = total1 * (i - it)
    }
    var total2 = k
    var j = k - 1
    repeat(k) {
        total2 = total2 * (j - it)
    }

    var total = total1 / total2

    var min = 16
    for (a in alist) {
        if (a.first().toInt() < k)
            continue
        if (a.last().toInt() > k && a.last() == "x") {
            print(0)
            return
        }
        if (k == a[0].toInt() && a[a.size - 1] == "o"){
            print(0)
            return
        }
        if (k <= a[0].toInt() && a[0].toInt() < min ){
            min = a[0].toInt()
        }
    }

}
