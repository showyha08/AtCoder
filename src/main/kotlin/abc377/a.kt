package abc377

fun main() {
    val s = readln()
    println(if (s.let { it.contains("A") && it.contains("B") && it.contains("C") }) "Yes" else "No")
}