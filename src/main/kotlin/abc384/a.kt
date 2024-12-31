package abc384

fun main() {
    val abcd = readln().split(" ")
    val abcd2 = abcd.filter { it != abcd[0] }
    if (abcd2.size == 3 && abcd2.all { it == abcd2[0] }
        || abcd2.size == 2 && abcd2[0] == abcd2[1]
        || abcd2.size == 1
    ) {
        println("Yes")
    } else{
        println("No")
    }
}