package abc348

fun main() {
    var s = readLine()!!.toInt()
    var out = ""
    for (i in 1.. s) {
        if (i % 3 == 0) out += "x" else out += "o"
    }
    print(out)
}