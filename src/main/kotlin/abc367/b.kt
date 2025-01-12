package abc367

fun main() {
    val n = readln().toMutableList()
    while (n.last() =='0'){
        n.removeLast()
    }
    if (n.last() =='.'){
        n.removeLast()
    }
    println(n.joinToString(""))
}

