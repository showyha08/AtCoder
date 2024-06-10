package abc357

fun main() {
    val s = readln()
    val lsc = s.filter { it in 'a'..'z' }.length
    val usc = s.filter { it in 'A'..'Z' }.length
    if (usc > lsc) {
        print(s.uppercase())
    } else {
        print(s.lowercase())
    }
    return
}
