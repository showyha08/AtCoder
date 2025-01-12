package abc381

fun main() {
    val n = readln().toInt()
    val s = readln()
    val t = s.length
    val harfP = (t + 1) / 2
    val isOdd = s.length % 2 == 1

    if(!isOdd){
        println("No")
        return
    }

    repeat(harfP - 1) {
        if (s[it] != '1') {
            println("No")
            return
        }
    }

    if (s[harfP-1] != '/') {
        println("No")
        return
    }

    for (i in harfP until t) {
        if (s[i] != '2') {
            println("No")
            return
        }
    }

    println("Yes")

}