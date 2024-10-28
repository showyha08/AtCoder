package abc375

fun main() {
    val n = readln()
    val s = readln().toCharArray()
    var ret = 0
    for (i in 0 until s.size - 2) {
        val t = s[i] == '#'
        val t1 = s[i + 1] == '.'
        val t2 = s[i + 2] == '#'
        if(t && t1 && t2){
            ret++
        }
    }
    println(ret)
}