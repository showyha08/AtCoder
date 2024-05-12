package abc352

fun main() {
    val n = readln().toInt()
    val h = readln().split(" ").map { it.toInt() }.toMutableList()
    val b = h[0]
    for (i in 1 until h.size)
    {
        if( b < h[i]){
            print(i+1)
            return
        }
    }
    print(-1)
    return
}