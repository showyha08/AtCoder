package abc360

fun main() {
    val s = readln()
    if (s[0] == 'R'){
        println("Yes")
        return
    } else if (s[1] == 'R' && s[2] == 'M'){
        println("Yes")
        return
    }
    println("No")
}