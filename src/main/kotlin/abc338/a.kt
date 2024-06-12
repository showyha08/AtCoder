package abc338

fun main() {
    val s = readln()
    if (s.first() == s.first().uppercaseChar()){
        val l = s.drop(1)
        if (l == l.lowercase()){
            println("Yes")
            return
        }
    }
    println("No")
}