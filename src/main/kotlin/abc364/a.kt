package abc364

fun main() {
    val n = readln().toInt()
    var preTaste = ""
    repeat (n){
        val s = readln()
        if (it != n-1 && preTaste == "sweet" && s == "sweet"){
            println("No")
            return
        }
        preTaste = s
    }
    println("Yes")
}